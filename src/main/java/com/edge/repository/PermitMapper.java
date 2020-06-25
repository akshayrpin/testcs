package com.edge.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.edge.data.Permit;

public class PermitMapper implements RowMapper<Object> {

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Permit permit = new Permit();
			permit.setId(rs.getInt(1));
			permit.setNumber(rs.getString(2));
			permit.setDescription(rs.getString(3));
		return permit;
	}

}
