package com.numetry.service;

import java.util.List;

import com.numetry.model.Voter;

public interface IvoterMgmtService {

	public String registerVoter(Voter voter);
	public List<Voter> getAllVoter();
	public String findVoterById(int voterId);
	
}
