package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import auxClasses.Livro;
import auxClasses.aux;
import comparator.ordenaAnoPub;
import comparator.ordenaAutor;
import comparator.ordenaNome;
import comparator.ordenaQuantidadePalavras;

public class ex02 {
	public static void ex2(ArrayList<Livro> biblio){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Selecionar para Ordenar:\n1 - Nome\n2 - Autor\n3 - Ano de publicacao\n4 - Quantidade de Palavras");
		switch(scn.nextInt()){
		
		case 1: Collections.sort(biblio, new ordenaNome());break;
		case 2: Collections.sort(biblio, new ordenaAutor());break;
		case 3: Collections.sort(biblio, new ordenaAnoPub());break;
		case 4: Collections.sort(biblio, new ordenaQuantidadePalavras());break;
		
		}
		aux.show(biblio);
		scn.close();
			
	}
}
