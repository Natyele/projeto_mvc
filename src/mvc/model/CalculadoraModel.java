package mvc.model;

public class CalculadoraModel {
	
	// Resposável por obter o valor do cálculo
	private int resultado;
	
	//Realizar o cálculo da soma
	public void somar(int numero1, int numero2) {
		this.resultado = numero1 + numero2;
	}
	
	
	// Exibir o cálculo
	public int retornarResultado() {
		return this.resultado;
	}

}
