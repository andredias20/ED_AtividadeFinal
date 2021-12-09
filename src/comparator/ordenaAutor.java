package comparator;

import java.util.Comparator;

import auxClasses.Livro;

public class ordenaAutor implements Comparator<Livro> {
	
	public int compare(Livro l1, Livro l2) {
		
		return String.CASE_INSENSITIVE_ORDER.compare(l1.getAutor(), l2.getAutor());
	}
	
}

