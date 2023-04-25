package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		User account = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new User(number, name, initialDeposit);
		}
		else {
			account = new User(number, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	
	}
}






/*	public static void main(String[] args) {

Locale.setDefault(Locale.US);
Scanner sc = new Scanner(System.in);
User account;

System.out.print("Enter account number: ");
int number = sc.nextInt();
System.out.print("Enter account holder: ");
sc.nextLine();
String holder = sc.nextLine();
System.out.print("Is there an initial deposit (y/n)? ");
char response = sc.next().charAt(0);
if (response == 'y') {
	System.out.print("Enter initial deposit value: ");
	double initialDeposit = sc.nextDouble();
	account = new User(number, holder, initialDeposit);
}
else {
	account = new User(number, holder);
}

System.out.println();
System.out.println("Account data:");
System.out.println(account);

System.out.println();
System.out.print("Enter a deposit value: ");
double depositValue = sc.nextDouble();
account.deposit(depositValue);
System.out.println("Updated account data:");
System.out.println(account);

System.out.println();
System.out.print("Enter a withdraw value: ");
double withdrawValue = sc.nextDouble();
account.withdraw(withdrawValue);
System.out.println("Updated account data:");
System.out.println(account);

sc.close();
}
*/