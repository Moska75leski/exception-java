package application;

import java.util.Scanner;

import entities.Account;


public class ProgramAccount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre numero da conta: ");
		int number = sc.nextInt();
		System.out.print("Entre titular da conta: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Tem deposito inicial: ");
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.print("Entre o valor inicial: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		
		
		
		sc.close();
	}

}
