package com.intiformation.bovoyage.wsrest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intiformation.bovoyage.entity.Agent;
import com.intiformation.bovoyage.service.IAgentService;

@RestController
public class AgentWSRest {
	
	/*--------- ASSOCIATION AVEC LA COUCHE SERVICE -------------- */
	
	@Autowired
	IAgentService agentService;

	// Setter pour l'injection Srping
	
	public void setAgentService(IAgentService agentService) {
		this.agentService = agentService;
	}
	
	/*------------------------- METHODE ------------------------ */
	
	@RequestMapping(value = "/agents/getAll", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Agent> getAllAgents() {
		List<Agent> listeAgents = agentService.getAllAgentService();
		return listeAgents;
	}

	

	/**
	 * Selection d'un agent
	 * @param idAgentIn
	 * @return
	 */
	@RequestMapping(value = "/agents/getById/{idAgent}", method = RequestMethod.GET, produces={"application/json"} )
	public Agent getAgentById(@PathVariable("idAgent") int idAgentIn) {
		return agentService.getByIdAgentService(idAgentIn);
	}

	/**
	 * Ajout d'un agent
	 * @param agentIn
	 */
	@RequestMapping(value = "/agents/add", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addAgent(@RequestBody Agent agentIn) {
		agentService.addAgentService(agentIn);
	}

	/**
	 * Modification d'un agent
	 * @param agentIn
	 */
	@RequestMapping(value = "/agents/update", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateAgent(@RequestBody Agent agentIn) {
		agentService.updateAgentService(agentIn);;

	}

	/**
	 * Suppression d'un agent
	 * @param idAgentIn
	 */
	@RequestMapping(value = "/agents/delete/{idAgent}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAgent(@PathVariable("idAgent") int idAgentIn) {
		agentService.deleteAgentService(idAgentIn);

	}

}
