package com.github.specht;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
