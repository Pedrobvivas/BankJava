package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Number account: ");
		int number=sc.nextInt();
		System.out.print("Holder name: ");
		sc.nextLine();
		String holder=sc.nextLine();
		System.out.print("Balance :");
		double balance=sc.nextDouble();
		System.out.print("WithDraw Limit: ");
		double withdrawLimit=sc.nextDouble();
		
		Account account=new Account(number,holder,balance,withdrawLimit);
		
		System.out.println();
		System.out.println("How much do you want withdraw? ");
		double amount=sc.nextDouble();
		
		
		try {
			account.withdraw(amount);
			System.out.printf("Novo saldo: %.2f%n", account.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
			sc.close();
		}
}
