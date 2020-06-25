package com.edge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edge.data.Permit;
import com.edge.service.HelloService;

@RestController()
@RequestMapping("/test")
public class HelloController {

	@Autowired
	HelloService hs; 
	
	@RequestMapping(value="/index", method = RequestMethod.GET)
	public List<Object> index() {
		
		try {
			return hs.getAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@RequestMapping(value="/index/{id}", method = RequestMethod.GET)
	public Permit getOne(@PathVariable("id") String id) {
		
		try {
			return hs.getOne(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}