package exercicios;

public class Product {

	private String name;
	private double price;
	private int qtd;

	public Product(String name, double price, int qtd) {
		super();
		this.name = name;
		this.price = price;
		this.qtd = qtd;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	

	public double totalValueInStock() {
		return this.price * this.qtd;
	}

	public void addProducts(int Qtd) {
		this.qtd += Qtd;
	}

	public void removeProducts(int Qtd) {
		this.qtd -= Qtd;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	@Override
	public String toString() {
		return "Product data:" +"\n" + name + ", $ " 
				+ String.format("%.2f", price) + ", " + qtd + " units," + " Total: $ " 
				+ String.format("%.2f", this.totalValueInStock());
	}



}
