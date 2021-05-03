package com.wesleycastilho.estruturadados.vetor.teste;

import com.wesleycastilho.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adicionaElemento(3);
		vetor.adicionaElemento(4);		
		vetor.adicionaElemento(5);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		System.out.println(vetor);
	}

}
