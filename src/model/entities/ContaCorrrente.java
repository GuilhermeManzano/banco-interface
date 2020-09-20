package model.entities;

import model.services.Tributavel;

public class ContaCorrrente extends Conta implements Tributavel {
	private double transferencia;

	public ContaCorrrente() {
		super();
	}

	public ContaCorrrente(String nome, String cpf, double saldo) {
		super(nome, cpf, saldo);
	}

	public ContaCorrrente(String nome, String cpf, double saldo, double transferencia) {
		super(nome, cpf, saldo);
		this.transferencia = transferencia;
	}

	public double getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(double transferencia) {
		this.transferencia = transferencia;
	}
	
	@Override
	public double calculaTributos() {
		return this.saldo - (this.saldo * 10);
	}
}
