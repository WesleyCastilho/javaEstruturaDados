package com.wesleycastilho.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public boolean verificaIndice(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return true;
	}
	
	
	public boolean adicionaElemento(String elemento) {
		
		this.aumentaCapacidade();
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public boolean adicionaElemento(int posicao, String elemento) {
		
		verificaIndice(posicao);
		
		this.aumentaCapacidade();
		
		for(int i = this.tamanho-1; i >= posicao; i --) {
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i < this.tamanho; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public String busca(int posicao) {
		verificaIndice(posicao);
		return this.elementos[posicao];
	}
	
	public int busca(String elemento) {
		for(int i=0; i <this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(int posicao) {
		verificaIndice(posicao);
		for(int i = posicao; i < this.tamanho -1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		
		
		
	}
	public int tamanho() {
		return this.tamanho;
	}


	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for(int i=0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");


		return s.toString();
	}

}
