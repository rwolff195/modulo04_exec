package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaCc;

public class ProgPrincipal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		ContaCc contaCc;
		
		System.out.print("Entre com o munero da Conta: ");
		int nunConta = sc.nextInt();
		
		System.out.print("Entre com o nome do Titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.print("Depósito inicial (S/N)? ");
		char resp = sc.next().charAt(0);
		sc.nextLine();
		
		if (resp == 's'){
			System.out.print("Entre com o valor do Deposito R$: ");
			double saldoInicial = sc.nextDouble();
			contaCc = new ContaCc(nunConta, nome, saldoInicial);
		}
		else {
			contaCc = new ContaCc(nunConta, nome);
		}
		
		System.out.println();
		System.out.println("*** Dados da Conta ***");
		System.out.println(contaCc);
		
		System.out.println();
		System.out.print("Deposito R$: ");
		double deposito = sc.nextDouble();
		contaCc.deposito(deposito);
		System.out.println("*** Dados da Conta ***");
		System.out.println(contaCc);
		
		System.out.println();
		System.out.print("Saque R$: ");
		double saque = sc.nextDouble();
		contaCc.saque(saque);
		System.out.println("*** Dados da Conta ***");
		System.out.println(contaCc);
		
		sc.close();
	}

}
