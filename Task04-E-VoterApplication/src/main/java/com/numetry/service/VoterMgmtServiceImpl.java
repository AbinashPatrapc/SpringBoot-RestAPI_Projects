package com.numetry.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.numetry.model.Voter;
import com.numetry.repository.IvoterRepo;

@Service
public class VoterMgmtServiceImpl implements IvoterMgmtService {
	
	@Autowired
	private IvoterRepo repo;

	@Override
	public String registerVoter(Voter voter) {
		Voter vote=repo.save(voter);
		int voterId=vote.getVoterId();
		return "New Voter Registered with "+voterId+" Voter Id";
	}

	@Override
	public List<Voter> getAllVoter() {
		return repo.findAll();
	}

	@Override
	public String findVoterById(int voterId) {
		return null;
	}

	

}
