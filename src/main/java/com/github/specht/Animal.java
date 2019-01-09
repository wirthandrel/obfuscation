package com.github.specht;


public abstract class Animal {
	
	TipoBicho tpBicho;
	
	public void correr() {
		
		
		System.out.println("...");
	}
	
	public void beberAgua() throws Exception {
		
		System.out.println(this.getClass().getName()+"");
		throw new Exception();
	}
	
	

}
