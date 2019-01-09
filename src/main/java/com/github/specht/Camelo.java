package com.github.specht;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.github.specht.interfaces.Bicho;

@Component
public class Camelo extends Animal implements Bicho {

	@Override
	public void beberAgua() throws Exception {
		System.out.println("Camelo bebendo");

	}

	/**
	 * Calcula Área
	 * 
	 * @param vlLadoA
	 * @param vlLadoB
	 * @return
	 */
	public Double area(Double vlLadoA, Double vlLadoB) {

		return vlLadoA * vlLadoB;

	}

	public static Double calculateEntropy(List<String> values) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Somatório para calcular a ocorrencia de cada valor
		for (String sequence : values) {
			// Preenche o mapa com a key sendo o valor e o value a quantidade
			if (!map.containsKey(sequence)) {
				map.put(sequence, 0);
			}
			// Adiciona um a quantidade
			map.put(sequence, map.get(sequence) + 1);
		}

		// Calcula a entropia
		Double result = 0.0;

		// Itera pelo conjunto de possíveis valores
		for (String sequence : map.keySet()) {
			// Calcula a frequencia que o registro aparece, a probabilidade do valor
			// aparecer na base de dados informada
			Double frequency = (double) map.get(sequence) / values.size();
			// Faz o calculo da entropia
			result -= frequency * (Math.log(frequency) / Math.log(2));
		}

		// Retorna o valor
		return result;
	}

	@Override
	public TipoBicho getTipoBicho() {
		return TipoBicho.CAMELO;
	}

}
