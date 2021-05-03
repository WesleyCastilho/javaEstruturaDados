package com.wesleycastilho.estruturadados.vetor.teste;

import com.wesleycastilho.estruturadados.vetor.Vetor;

public class Aula9 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);

		vetor.adicionaElemento("B");
		vetor.adicionaElemento("G");
		vetor.adicionaElemento("D");
		vetor.adicionaElemento("E");
		vetor.adicionaElemento("F");

		System.out.println(vetor);
		
		vetor.remove(1);
		
		System.out.println(vetor);
		
		System.out.println("Remover o elemento ? ");
		
		int pos = vetor.busca("A");
		
		if(pos >= 0 ) {
			vetor.remove(pos);
		} else {
			System.out.println("Elemento nao existe no vetor");
		}
		System.out.println(vetor);

	}

}
