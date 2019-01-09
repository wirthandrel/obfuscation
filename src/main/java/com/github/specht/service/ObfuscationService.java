package com.github.specht.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.specht.Cachorro;
import com.github.specht.Camelo;

@Service
public class ObfuscationService {
	
	@Autowired
	private Cachorro cachorro;
	
	@Autowired
	private Camelo camelo;
	
	
	public void fazAlgo() {
		
		cachorro.correr();
		try {
			camelo.beberAgua();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
