package com.biss.controller.rest;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biss.repository.IncrementTabRepository;

@RestController
@RequestMapping("/counter")
public class IncrementTabController {
	
	@Autowired
	private IncrementTabRepository repo;
	/*
		This method call the increment method of
		repository method. Use @Transactional
		for transaction management for update operation.
	*/	
	@PutMapping("/incr")
	@Transactional
	public ResponseEntity<String> IncrementTab() {
		ResponseEntity<String> resp=null;
		try {
			repo.incrCounter();
			resp=new ResponseEntity<String>("Counter Increment",HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			resp=new ResponseEntity<String>("Unable to update the record",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return resp;
	}
}
