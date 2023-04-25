package entities;

public class User {
	
	private int number;
	private String name;
	private double balance;
	
	public User(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public User(int number, String name, double initialDeposit) {
		super();
		this.number = number;
		this.name = name;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public double deposit(double amount) {
		return balance += amount;
	}
	
	public double withdraw(double amount) {
		return balance -= amount + 5.0;
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ name 
				+ ", Balance: $ " 
				+ String.format("%.2f", balance);
	}
}





/*	private int number;
private String holder;
private double balance;

public User(int number, String holder) {
	this.number = number;
	this.holder = holder;
}

public User(int number, String holder, double initialDeposit) {
	this.number = number;
	this.holder = holder;
	deposit(initialDeposit);
}

public int getNumber() {
	return number;
}

public String getHolder() {
	return holder;
}

public void setHolder(String holder) {
	this.holder = holder;
}

public double getBalance() {
	return balance;
}

public void deposit(double amount) {
	balance += amount;
}

public void withdraw(double amount) {
	balance -= amount + 5.0;
}

public String toString() {
	return "Account " 
			+ number 
			+ ", Holder: " 
			+ holder 
			+ ", Balance: $ " 
			+ String.format("%.2f", balance);
} 
*/