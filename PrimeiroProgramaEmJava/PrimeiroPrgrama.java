package com.dio;

import java.util.Scanner;

public class PrimeiroPrgrama {

	public static void main(String[] args) {
		
		
		
		// Primeios passos no java com  Camila Cavancate - DIO
		int a =2;
		int b =3 ;
		System.out.println("Ola Mundo" +(a + b));
		
		
		Gato MeuGatoLindo= new Gato();
	    Livros MeuLivro = new Livros(); 
	    
	     MeuGatoLindo.setNome("Mimi");
	     MeuGatoLindo.setCor("Branco");
	     MeuGatoLindo.setIdade(2);
	     
	     System.out.println("Nome do Gato: " + MeuGatoLindo.getNome());
	     System.out.println("Cor do Gato: " + MeuGatoLindo.getCor());
	     System.out.println("Idade do Gato: " + MeuGatoLindo.getIdade() + "Anos");
				
	}
	 
}

class Livros {
	private String nome;
	private int NumeroDePaginas;
	
}