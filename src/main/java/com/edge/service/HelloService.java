package com.edge.service;

import java.util.List;

import com.edge.data.Permit;

public interface HelloService {
	
	List<Object> getAll() throws Exception ;
	
	Permit getOne(String id) throws Exception;

}
