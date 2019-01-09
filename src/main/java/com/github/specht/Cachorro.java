package com.github.specht;

import org.springframework.stereotype.Component;

import com.github.specht.interfaces.Bicho;
import com.github.specht.interfaces.Obfuscation;

@Component
public class Cachorro extends Animal implements Obfuscation, Bicho {

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println("Cachorro correndo");
	}

	@Override
	public void ola() {
		System.out.println("Olá");

	}

	@Override
	public TipoBicho getTipoBicho() {

		return TipoBicho.CACHORRO;
	}

}
