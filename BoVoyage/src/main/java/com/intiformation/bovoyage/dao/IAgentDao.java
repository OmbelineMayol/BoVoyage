package com.intiformation.bovoyage.dao;

import java.util.List;

import com.intiformation.bovoyage.entity.Agent;

public interface IAgentDao {
	
	
	public void addAgentDao (Agent agentIn);
	
	public Agent getByIdAgentDao (int idAgentIn);
	
	public void updateAgentDao (Agent agentIn);
	
	public void deleteAgentDao (int idAgentIn);
	
	public List<Agent> getAllAgentDao();
	

}
