package com.ambity.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyServiceImpl implements MyService{

	public void say(){
		System.out.println("aaaa");
	}
}
