package Exercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

import auxClasses.Livro;
import auxClasses.Palavra;
import comparator.*;

public class Exercicios {
	
	private ArrayList<Livro> b;
	
	public Exercicios(ArrayList<Livro> biblioteca) {
		this.b = biblioteca;
	}
	
	public void ex3_B() {//(b) Quantas palavras distintas existem em cada livro?
		
		for(Livro a : this.b) {
			
			HashSet<String> biblio = new HashSet<>();
			
			String teste[] = a.getSpt(); //Aproveitando o split feito na estrutura livros para contagem de palavras.
			
			for(int i = 0; i < teste.length; i++) {
				biblio.add(teste[i].trim());
			}
			
			System.out.print("\nLivro: "+a.getNome_livro()+" || Distintas: "+biblio.size());
		}
	}
	public void ex3_C() {//	(c) Quantas palavras distintas existem em toda biblioteca?
		
		HashSet<String> biblio = new HashSet<>();
		
		for(Livro a : this.b) {
			String teste[] = a.getSpt(); //Aproveitando o construtor do livro
			for(int i = 0; i < teste.length; i++) {
				biblio.add(teste[i]);
			}
		}
		System.out.println("- Distintas na Biblioteca: "+biblio.size());
		
	}
	public void ex3_D() {//(d) Quantas vezes a palavra “anyone” (ou qualquer outra) aparece em cada livro?
		
		String content = "someone";
		for(Livro a : this.b) {
			
			TreeMap<String, Integer> map = new TreeMap<>(); //
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
				}
			}
			map.remove("");
			
			if(map.containsKey(content)) {
				System.out.print("\nLivro: "+a.getNome_livro()+" *"+ content +"* apareceu: "+map.get(content));
			}else {
				System.out.print("\nLivro: "+a.getNome_livro()+" *"+ content +"* nao foi encontrada");
			}
		}
	}
	public void ex3_E() {//(e) Quantas vezes a palavra “anyone” (ou qualquer outra) aparece em toda a biblioteca?
		String content = "anyone";
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(Livro a : this.b) {
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
				}
			}
		}
		System.out.println("\nNa biblioteca a palavra *"+ content +"* apareceu: "+map.get(content));
	}
	public void ex3_F() {//(f) Qual a palavra mais frequente em cada livro?
		
		for(Livro a : this.b) {
			HashSet<String> hash = new HashSet<>();
			TreeMap<String, Integer> map = new TreeMap<>();
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
					hash.add(key);
				}
			}
			map.remove("");
			hash.remove("");
			TreeSet<Palavra> set = new TreeSet<>(new ordenaPalavra());// O(log n)
			for(String bi : hash) {
				int qtd = map.get(bi);
				set.add(new Palavra(qtd,bi));
			}
			
			System.out.println(a.getNome_livro()+" -	"+set.last());
			
		}
	}
	public void ex3_G() {//(g) Qual a palavra menos frequente em cada livro?
		
		for(Livro a : this.b) {
			HashSet<String> hash = new HashSet<>();
			TreeMap<String, Integer> map = new TreeMap<>();
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
					hash.add(key);
				}
			}
			map.remove("");
			hash.remove("");
			TreeSet<Palavra> set = new TreeSet<>(new ordenaPalavra());// O(log n)
			for(String bi : hash) {
				int qtd = map.get(bi);
				set.add(new Palavra(qtd,bi));
			}
			
			
			
			System.out.println(a.getNome_livro()+" - "+set.first());
			
		}
	}
	public void ex3_H() {//(h) Qual as cinco (ou qualquer outro número) palavras mais frequentes em cada livro?
		
		int numeros = 5;
		
		for(Livro a : this.b) {
			TreeMap<String, Integer> map = new TreeMap<>();
			
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
				}
			}
			map.remove("");
			TreeSet<Palavra> arr = new TreeSet<>(new ordenaPalavra());// O(log n)
			for(String bi : map.keySet()) {
				int qtd = map.get(bi);
				arr.add(new Palavra(qtd,bi));
			}
			int cc = 0;
			String retornar ="";
			for(Palavra bi : arr.descendingSet()) {
				if(cc < numeros) {
					retornar += "["+bi.getPalavra()+ " = "+bi.getRep()+"]";
				}else {
					break;
				}
				cc++;
			}
			System.out.println(a.getNome_livro()+": "+retornar);
		}
	}
	public void ex3_I() {//(i) Qual as cinco (ou qualquer outro número) palavras menos frequente em cada livro?
		
		int numeros = 5;
		
		for(Livro a : this.b) {
			TreeMap<String, Integer> map = new TreeMap<>();
			
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
				}
			}
			map.remove("");
			TreeSet<Palavra> arr = new TreeSet<>(new ordenaPalavra());// O(log n)
			for(String bi : map.keySet()) {
				int qtd = map.get(bi);
				arr.add(new Palavra(qtd,bi));
			}
			
			int cc = 0;
			String retornar ="";
			for(Palavra bi : arr.descendingSet().descendingSet()) {
				if(cc < numeros) {
					retornar += "["+bi.getPalavra()+ " = "+bi.getRep()+"]";
				}else {
					break;
				}
				cc++;
			}
			System.out.println(a.getNome_livro()+": "+retornar);
		}
	}
	public void ex3_J() {//(j) Quais as palavras com frequencia acima de 1000 (ou qualquer outro número) na biblioteca?
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		for(Livro a : this.b) {
			
			for(String key : a.getSpt()){
				if(map.containsKey(key)) {
					Integer i = map.get(key);
					i++;
					map.put(key, i);
				}else {
					map.put(key, 1);
				}
			}
			map.remove("");
			
			
		}
		TreeMap<Integer, ArrayList<String>> map2 = new TreeMap<>();
		
		for(String palavra : map.keySet()){
			if(map2.containsKey(map.get(palavra))) {
				
				ArrayList<String> palavras = map2.get(map.get(palavra));
				palavras.add(palavra);
				
			}else {
				ArrayList<String> palavrasARR = new ArrayList<>();
				palavrasARR.add(palavra);
				map2.put(map.get(palavra), palavrasARR);
			}
		}
		
		System.out.println("'Quantidade de ocorrencias = [nomes, relacionados, a, esta, quantidade]'\n\n"+map2.tailMap(1000));
		
		
	}
	public void ex3_K() {//(k) Retorne a lista de palavras que tenham ordem lexicográfica acima de “warm” (ou qualquer outra).
			
			String word = "warm";
		
			TreeMap<String, Integer> map = new TreeMap<>();
			
			for(Livro a : this.b) {
				
				for(String key : a.getSpt()){
					map.put(key, 0);
				}
				
				
			}
			System.out.println("Tail: "+map.tailMap(word).keySet());
		}
	public void ex3_L() {//(l) Retorne a lista de palavras que tenham ordem lexicográfica abaixo de “asked” (ou qualquer outra).
			
			String word = "asked";
			
			TreeMap<String, Integer> map = new TreeMap<>();
			
			for(Livro a : this.b) {
				
				for(String key : a.getSpt()){
					if(map.containsKey(key)) {
						Integer i = map.get(key);
						i++;
						map.put(key, i);
					}else {
						map.put(key, 0);
					}
				}
				
				
			}
			map.remove("");
			System.out.println("Head: "+map.headMap(word).keySet());
		}
	
	
}
