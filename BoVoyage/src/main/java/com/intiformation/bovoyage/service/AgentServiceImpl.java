package com.intiformation.bovoyage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiformation.bovoyage.dao.IAgentDao;
import com.intiformation.bovoyage.entity.Agent;

@Service
public class AgentServiceImpl implements IAgentService {
	
	/* ------------ ASSOCIATION AVEC LA COUCHE DAO -------------- */
	@Autowired
	private IAgentDao agentDao;

	//setter
	public void setAgentDao(IAgentDao agentDao) {
		this.agentDao = agentDao;
	}
	

	/* --------------- REDEFINITION DES METHODES ---------------- */
	

	public void addAgentService(Agent agentIn) {
		agentDao.addAgentDao(agentIn);
		
	}

	public Agent getByIdAgentService(int idAgentIn) {
		return agentDao.getByIdAgentDao(idAgentIn);
	}

	public void updateAgentService(Agent agentIn) {
		agentDao.updateAgentDao(agentIn);
		
	}

	public void deleteAgentService(int idAgentIn) {
		agentDao.deleteAgentDao(idAgentIn);
		
	}

	public List<Agent> getAllAgentService() {
		return agentDao.getAllAgentDao();
	}


	
	public Agent isExist(String username, String password) {
		return agentDao.isExist(username, password);
	}

}
