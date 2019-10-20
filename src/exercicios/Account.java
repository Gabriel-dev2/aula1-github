package exercicios;

public class Account implements BankAccount{

	private String name;
	private final int NUM_AC;
	private double balance;

	public Account(String name, int nUM_AC, double initialDeposit) {
		super();
		this.name = name;
		NUM_AC = nUM_AC;
		this.depositar(initialDeposit);
	}
	
	@Override
	public void depositar(double valor) {
		this.balance += valor;
		System.out.println("Deposited Amount R$ " + String.format("%.2f", valor));
		System.out.println("New balance R$ " + String.format("%.2f", this.balance));
	}

	@Override
	public void sacar(double valor) {
		this.balance -= valor;
		this.balance -= 5;
		System.out.println("Amount withdrawn R$ " + String.format("%.2f", valor));
		System.out.println("New balance R$ " + String.format("%.2f", this.balance));
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

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNUM_AC() {
		return NUM_AC;
	}

	@Override
	public String toString() {
		return "Account data:\n" + "Account: "+ NUM_AC + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}


    
      


}
