package view;

import javax.swing.JOptionPane;

import com.willoak.utils.pilha.string.Pilha;

import controller.PalindromoController;

public class Principal {

	public static void main(String[] args) {
		PalindromoController palindromoController = new PalindromoController();
		Pilha pilha = new Pilha();
		String mensagem;
		String palavra;
		String palavraInvertida;
		
		palavra = JOptionPane.showInputDialog(null, "Insira uma palavra para verificar se � um pal�ndromo");
		palavraInvertida = palindromoController.invertePalavra(palavra, pilha);
		
		if (palindromoController.palindromo(palavra, palavraInvertida)) {
			mensagem = "� um palindromo";
		} else {
			mensagem = "N�o � um pal�ndromo";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
	}

}
