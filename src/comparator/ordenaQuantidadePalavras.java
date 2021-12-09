package comparator;

import java.util.Comparator;

import auxClasses.Livro;

public class ordenaQuantidadePalavras implements Comparator<Livro> {
	public int compare(Livro l1, Livro l2) {
		
		return Integer.compare(l1.getQte_palavras(), l2.getQte_palavras());
	}
}
