package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.CalculadoraModel;
import mvc.view.CalculadoraView;

public class CalculadoraController {

	// Objetos das classes View e Model
	private CalculadoraView view;
	private CalculadoraModel model;

	// Construtor
	public CalculadoraController(CalculadoraView view, CalculadoraModel model) {
		this.view = view;
		this.model = model;

		// Implementar um ouvinte para o botão da view
		this.view.CalculadoraListener(new CalculadoraListener());
	}

	// Classe ouvinte (Listener), para o botão da view
	class CalculadoraListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			// Variáveis locais
			int numero1, numero2 = 0;

			// Tentativa
			try {
				numero1 = view.getNumero1();
				numero2 = view.getNumero2();
				model.somar(numero1, numero2);
				view.setResultado(model.retornarResultado());
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("Ops:Ocorreu um erro, letras não são permitidas apenas números ");			}
		}
	}
}
