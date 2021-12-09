package auxClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LeitorLivros {
	public static ArrayList<Livro> readFiles() throws IOException {
		
		ArrayList<Livro> biblioteca= new ArrayList<>();
		ArrayList<Path> arquivos = new ArrayList<>();
		
/* 1 */	arquivos.add(Paths.get("src/lista/livros/AlicesAdventuresinWonderland_by_LewisCarrol.txt"));		
/* 2 */	arquivos.add(Paths.get("src/lista/livros/Anthem.txt"));
/* 3 */	arquivos.add(Paths.get("src/lista/livros/dracula_by_BramStoker.txt"));
/* 4 */	arquivos.add(Paths.get("src/lista/livros/Frankenstein.txt"));
/* 5 */	arquivos.add(Paths.get("src/lista/livros/Metamorphosis.txt"));
/* 6 */	arquivos.add(Paths.get("src/lista/livros/Moby-Dick.txt"));
/* 7 */	arquivos.add(Paths.get("src/lista/livros/Peter Pan.txt"));
/* 8 */	arquivos.add(Paths.get("src/lista/livros/The Art of War.txt"));
/* 9 */	arquivos.add(Paths.get("src/lista/livros/theGreatGatsby_by_FScootFitzgerald.txt"));
/* 10 */arquivos.add(Paths.get("src/lista/livros/The History of Don Quixote.txt")); 
		
		
		for(Path files : arquivos) {
			StringBuilder stringBuilder = new StringBuilder();
			
			BufferedReader br = Files.newBufferedReader(files);
			String line;
			while((line = br.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append("\n");
			}
			biblioteca.add(new Livro(stringBuilder));
		}
		
		
		return biblioteca;
	}
}
