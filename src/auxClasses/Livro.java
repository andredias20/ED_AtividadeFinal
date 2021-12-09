package auxClasses;

import java.util.regex.Pattern;

public class Livro {
	private String nome_livro;
	private String autor;
	private int ano_publicacao;
	private int qte_palavras;
	private String conteudo;
	private String spt[];
	
	public Livro(StringBuilder st) {
		
		int nomeIndex = st.lastIndexOf("Title:");
		int afterNome = st.indexOf("\n",nomeIndex);
		String[] subT = (st.substring(nomeIndex, afterNome)).split("Title:");
		String subName = "";
		for(int i = 0;i<subT.length;i++) {subName += subT[i];};
		this.nome_livro = subName;
		
		int authorIndex = st.lastIndexOf("Author:");
		int afterAuthor = st.indexOf("\n",authorIndex);
		this.autor = st.substring(authorIndex, afterAuthor).replace("Author: ", "");
		
		int anoIndex = st.lastIndexOf("Release Date:");
		int afterAno = st.indexOf("\n",anoIndex);
		String sub = st.substring(anoIndex, afterAno);
		String[] a = sub.split(" ");
		for(int i = 0; i<a.length;i++ ) {
			if((Pattern.matches("[0-9]{4}", a[i])) == true) {
				this.ano_publicacao = Integer.valueOf(a[i]);
			}
		}
		int indexCstart =st.indexOf("*** START");
		int startIndex = st.indexOf(" ***", indexCstart);
		int endIndex = st.indexOf("*** END");
		String aux = st.substring(startIndex+6, endIndex-2);
		this.conteudo = aux.toLowerCase().replaceAll("[^0-9a-z \n]", " ").trim();
		this.spt = this.conteudo.split("[ \\n]");
		
		String[] subAux = aux.toLowerCase().trim().replaceAll("[^0-9a-z \\n]", " ").split("[ \\n]");
		this.qte_palavras = subAux.length;
		
	}

	@Override
	public String toString() { //Ex2 Letra A
		return "Nome do livro:" + nome_livro + "\nAutor: " + autor + "\nAno de publicacao:" + ano_publicacao
				+ "\nQuantidade de palavras:" + qte_palavras + "\n\n";	
	}
	public String getNome_livro() {
		return nome_livro;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public int getQte_palavras() {
		return qte_palavras;
	}

	public String getConteudo() {
		return conteudo;
	}
	public String[] getSpt() {
		return this.spt;
	}
	

}

