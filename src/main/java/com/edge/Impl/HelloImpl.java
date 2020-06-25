package com.edge.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edge.data.Permit;
import com.edge.repository.HelloRepository;
import com.edge.service.HelloService;

@Service("HelloImpl")
public class HelloImpl implements HelloService{
	
	@Autowired
	HelloRepository hr;
	
	@Override
	public List<Object> getAll() throws Exception {
		 
		return hr.getAll();
	}

	@Override
	public Permit getOne(String id) throws Exception {
		// TODO Auto-generated method stub
		return hr.getOne(id);
	}

}
