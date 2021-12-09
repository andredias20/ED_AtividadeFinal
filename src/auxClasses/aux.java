package auxClasses;

import java.util.ArrayList;

public class aux {
	public static void show(ArrayList<Livro> a) {
		for(Livro l  : a) {
			System.out.println("\nNome: "+l.getNome_livro());
			System.out.println("Autor: "+l.getAutor());
			System.out.println("Ano: "+ l.getAno_publicacao());
			System.out.println("Quantidade palavras: "+ l.getQte_palavras()+"");
		}
	}
	
	public static String showString(ArrayList<Livro> a) {
		String stt = "";
		for(Livro l  : a) {
			stt +=("\nNome: "+l.getNome_livro());
			stt +=("\nAutor: "+l.getAutor());
			stt +=("\nAno: "+ l.getAno_publicacao());
			stt +=("\nQuantidade palavras: "+ l.getQte_palavras()+"\n\n");
		}
		return stt;
	}
/*	
	public static TreeSet<Palavra> contaPalavrasSet(Livro b){
			
		TreeMap<String, Integer> map = new TreeMap<>();
		HashSet<String> hash = new HashSet<>();
		for(String key : b.getSpt()){
			if(map.containsKey(key)) {
				Integer i = map.get(key);
				i++;
				map.put(key, i);
			}else {
				map.put(key, 0);
				hash.add(key);
			}
		}
		map.remove("");
		TreeSet<Palavra> arr = new TreeSet<>(new ordenaPalavra());// O(log n)
		for(String bi : hash) {
			int qtd = map.get(bi);
			arr.add(new Palavra(qtd,bi));
		}
			
			
		return arr;
	}
	
	public static TreeMap<String, Integer> contaPalavrasMap(Livro b){
	
		TreeMap<String, Integer> map = new TreeMap<>(); //
		for(String key : b.getSpt()){
			if(map.containsKey(key)) {
				Integer i = map.get(key);
				i++;
				map.put(key, i);
			}else {
				map.put(key, 0);
			}
		}
		map.remove("");
		
	
		return map;
}
*/
}
