package comparator;

import java.util.Comparator;

import auxClasses.Livro;

public class ordenaNome implements Comparator<Livro> {
	
	public int compare(Livro l1, Livro l2) {
		
		return String.CASE_INSENSITIVE_ORDER.compare(l1.getNome_livro(), l2.getNome_livro());
	}
	
}
