package com.wesleycastilho.estruturadados.vetor.teste;

import com.wesleycastilho.estruturadados.vetor.Vetor;

public class Aula5 {

	public static void main(String[] args) {


		Vetor vetor = new Vetor(10);

		vetor.adicionaElemento("elemento 1");
		vetor.adicionaElemento("elemento 2");
		vetor.adicionaElemento("elemento 3");

		System.out.print(vetor.busca(17));

	}

}
