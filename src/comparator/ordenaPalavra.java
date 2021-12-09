package comparator;

import java.util.Comparator;

import auxClasses.Palavra;

public class ordenaPalavra implements Comparator<Palavra>{
	public int compare(Palavra l1, Palavra l2) {
		
		return Integer.compare(l1.getRep(), l2.getRep());
	}
}
