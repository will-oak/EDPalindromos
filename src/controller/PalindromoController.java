package controller;

import com.willoak.utils.pilha.string.Pilha;

public class PalindromoController {

	public PalindromoController() {
		super();
	}
	
	public String invertePalavra(String palavra, Pilha pilha) {
		String palavraInvertida = "";
		
		for (int i = 0; i < palavra.length(); i++) {
			pilha.push(palavra.substring(i, i + 1));
		}
		
		while (!pilha.isEmpty()) {
			try {
				palavraInvertida = palavraInvertida + pilha.pop();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return palavraInvertida;
	}
	
	public boolean palindromo(String palavra, String palavraInvertida) {
		if (palavra.equals(palavraInvertida)) {
			return true;
		}
		
		return false;
	}
}
