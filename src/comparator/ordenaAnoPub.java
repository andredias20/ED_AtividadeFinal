package comparator;

import java.util.Comparator;

import auxClasses.Livro;

public class ordenaAnoPub implements Comparator<Livro> {
	
		public int compare(Livro l1, Livro l2) {
			
			return Integer.compare(l1.getAno_publicacao(), l2.getAno_publicacao());
		}
}
