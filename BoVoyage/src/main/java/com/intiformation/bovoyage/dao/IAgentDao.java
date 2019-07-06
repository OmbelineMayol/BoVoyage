package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Agent;
import com.intiformation.bovoyage.entity.Client;

public interface IAgentDao {

	public void addAgentDao(Agent agentIn);

	public Agent getByIdAgentDao(int idAgentIn);

	public void updateAgentDao(Agent agentIn);

	public void deleteAgentDao(int idAgentIn);

	public List<Agent> getAllAgentDao();
	
	public Agent isExist(String username, String password);

}
