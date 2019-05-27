package entidades;

public class ContaCc {

	private int nunConta;
	private String nome;
	private double saldo;
	
	// Contrutores
	
	public ContaCc() {
	}
	
	public ContaCc(int nunConta, String nome) {
		this.nunConta = nunConta;
		this.nome = nome;
	}
	
	public ContaCc(int nunConta, String nome, double saldoInicial) {
		this.nunConta = nunConta;
		this.nome = nome;
		deposito(saldoInicial);
	}
	
	// Getters e Setters
	
	public int getNunConta() {
		return nunConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
	//Métodos específicos
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		saldo -= saque + 5;
	}
	
	public String toString() {
		return "Conta: "
			   + nunConta
			   + ", Nome: "
			   + nome
			   + ", Saldo R$: "
			   + String.format("%.2f", saldo);
	}	
	
}
