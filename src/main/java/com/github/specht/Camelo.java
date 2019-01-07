package com.github.specht;

import org.springframework.stereotype.Component;

@Component
public class Camelo extends Animal{
	
	@Override
	public void beberAgua() throws Exception {
		System.out.println("Camelo bebe agua");
		
	}

}
