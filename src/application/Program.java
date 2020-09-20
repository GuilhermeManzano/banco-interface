package application;

import model.entities.ContaCorrrente;
import model.entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) {
		ContaPoupanca cp1 = new ContaPoupanca("Felipe", "432.323.421-33", 0);
		ContaCorrrente cc1 = new ContaCorrrente("Roberto", "213.213.234-32", 200);
		
		cp1.depositar(200);
		cp1.obterSaldo();
		System.out.println();

		cc1.depositar(500);
		cc1.obterSaldo();
		cc1.calculaTributos();
		cc1.obterSaldo();
		cc1.sacar(200);
		cc1.obterSaldo();
	}
}
