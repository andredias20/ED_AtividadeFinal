package auxClasses;

public class Palavra {
	private int rep;
	private String palavra;
	
	public Palavra(int rep, String palavra) {
		this.rep = rep;
		this.palavra = palavra;
	}
	
	public String getPalavra() {
		return palavra;
	}
	public int getRep() {
		return rep;
	}
	
	public String toString() {
		return "Palavra: '" + this.palavra + "' Repetições: "+rep;
	}
}
