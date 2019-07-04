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
	
	/**
	 * Liaison � la couche Service
	 */
	@Autowired
	IAgentService agentService;

	/**
	 * Liste des agents
	 * @return
	 */
	@RequestMapping(value = "/agents", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Agent> getAllAgents() {
		List<Agent> listeAgents = agentService.getAllAgentService();
		return listeAgents;
	}

	/**
	 * Selection d'un agent
	 * @param idAgentIn
	 * @return
	 */
	@RequestMapping(value = "/agents/{id}", method = RequestMethod.GET, produces={"application/json"} )
	public Agent getAgentById(@PathVariable int idAgentIn) {
		return agentService.getByIdAgentService(idAgentIn);
	}

	/**
	 * Ajout d'un agent
	 * @param agentIn
	 */
	@RequestMapping(value = "/agents", method = RequestMethod.POST, produces= "application/json", consumes="application/json")
	public void addAgent(@RequestBody Agent agentIn) {
		agentService.addAgentService(agentIn);
	}

	/**
	 * Modification d'un agent
	 * @param agentIn
	 */
	@RequestMapping(value = "/agents", method = RequestMethod.PUT, produces= "application/json",consumes="application/json")
	public void updateAgent(@RequestBody Agent agentIn) {
		agentService.updateAgentService(agentIn);;

	}

	/**
	 * Suppression d'un agent
	 * @param idAgentIn
	 */
	@RequestMapping(value = "/agents/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteAgent(@PathVariable("id") int idAgentIn) {
		agentService.deleteAgentService(idAgentIn);

	}

}
