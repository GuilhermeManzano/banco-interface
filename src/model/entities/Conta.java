package model.entities;

public class Conta {
	private static Integer id=0;
	private String nome;
	private String cpf;
	protected double saldo;
	
	public Conta(String nome, String cpf, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Conta() {
	}
	

	public static Integer getId() {
		return id;
	}

	public static void setId(Integer id) {
		Conta.id += id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void sacar(double valor) {
		saldo =  saldo - valor;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	public void obterSaldo() {
		System.out.println("O saldo é: " + this.saldo);
	}
}
