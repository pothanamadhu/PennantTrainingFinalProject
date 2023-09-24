package com.example.madhu.daos;

import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.madhu.contracts.ClaimsDao;
import com.example.madhu.models.Claims;
import com.example.madhu.rowmappers.ClaimsMapper;

@Component
public class ClaimsDaoImpl implements ClaimsDao {

	
	JdbcTemplate jdbcTemplate;
	
	
	private String SQL_GET_CLAIMS = "select * from  Claims";
	private String SQL_GET_FILTERED_CLAIMS = "select * from  Claims where clam_status=?";
	private String SQL_GET_CLAIM_BY_ID = "select * from  Claims where clam_id=?";
	
	@Autowired
	public ClaimsDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public ArrayList<Claims> getAllClaims() {
		
		return (ArrayList<Claims>) jdbcTemplate.query(SQL_GET_CLAIMS,new ClaimsMapper());
	}

	@Override
	public ArrayList<Claims> getFilteredClaims(String status) {
		// TODO Auto-generated method stub
		return (ArrayList<Claims>) jdbcTemplate.query(SQL_GET_FILTERED_CLAIMS,new Object[] {status},new ClaimsMapper());
	}

	@Override
	public Claims getClaimById(int clamId) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(SQL_GET_CLAIM_BY_ID,new Object[] {clamId},new ClaimsMapper());
	}


}
