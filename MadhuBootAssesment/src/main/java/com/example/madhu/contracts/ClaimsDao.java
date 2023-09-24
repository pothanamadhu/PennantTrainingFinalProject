package com.example.madhu.contracts;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import com.example.madhu.models.Claims;

public interface ClaimsDao {


	ArrayList<Claims> getAllClaims();

	ArrayList<Claims> getFilteredClaims(String status);

	Claims getClaimById(int clamId);

}
