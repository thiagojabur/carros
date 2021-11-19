package carro;

public class Principal {

	public static void main(String[] args) {

		final int TAMANHOESTOQUE = 1000;
		Carro estoque[] = new Carro[TAMANHOESTOQUE];

		System.out.println("Iniciando");
		for (int i = 0; i < TAMANHOESTOQUE; i++) {
		    estoque[i] = new Carro(new Pneu("Goodyear"), new Pneu("Goodyear"), new Pneu("Goodyear"),
		        new Pneu("Goodyear"), new Pneu("Goodyear"));
		}

		System.out.println("Criados " + TAMANHOESTOQUE + " carros no estoque.");

		for (int i = 0; i < TAMANHOESTOQUE; i++) {
			System.out.println(estoque[i].pneul.getMarca());
		}
		
	}

}
