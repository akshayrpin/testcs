package com.edge.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edge.data.Permit;

@Repository
public class HelloRepository {
	
	@Autowired
	JdbcTemplate db;
	
	public List<Object> getAll() {
		int id = -1;
		try {
			String sql = "SELECT top 100 act_id, act_nbr, act_type FROM ACTIVITY order by act_id desc";
			List<Object> permit = db.query(sql, new PermitMapper());
			return permit;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
	
	public Permit getOne(String id) {
		try {

			String sql = "SELECT top 100 act_id, act_nbr, act_type FROM ACTIVITY where act_id = ?";
			Permit permit = (Permit) db.queryForObject(sql, new Object[] {id}, new PermitMapper());
			return permit;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
