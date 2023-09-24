package com.example.madhu.repositaries;

import com.example.madhu.contracts.ClaimsDao;
import com.example.madhu.contracts.IService;
import com.example.madhu.models.Claims;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Service
public class ClaimService implements IService {
	@Autowired
	ClaimsDao cdao;
	

	@Override
	public ArrayList<Claims> getAllClaims() {
		// TODO Auto-generated method stub
		return (ArrayList<Claims>)cdao.getAllClaims();
	}


	@Override
	public ArrayList<Claims> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claims>)cdao.getFilteredClaims(status);
	}


	@Override
	public Claims getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return cdao.getClaimById(clamId);
	}



	


}
