package com.intiformation.bovoyage.service;

import java.util.List;

import com.intiformation.bovoyage.entity.Agent;

public interface IAgentService {

	public void addAgentService(Agent agentIn);

	public Agent getByIdAgentService(int idAgentIn);

	public void updateAgentService(Agent agentIn);

	public void deleteAgentService(int idAgentIn);

	public List<Agent> getAllAgentService();

}
