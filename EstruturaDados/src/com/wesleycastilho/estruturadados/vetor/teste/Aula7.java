package com.wesleycastilho.estruturadados.vetor.teste;

import com.wesleycastilho.estruturadados.vetor.Vetor;

public class Aula7 {
	
	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adicionaElemento("B");
		vetor.adicionaElemento("C");
		vetor.adicionaElemento("E");
		vetor.adicionaElemento("F");
		vetor.adicionaElemento("G");
		
		System.out.println(vetor);
		
		vetor.adicionaElemento(0, "A");
		System.out.println(vetor);
		vetor.adicionaElemento(3, "D");
		System.out.println(vetor);
		
	}
	
}
