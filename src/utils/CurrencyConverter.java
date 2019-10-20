package utils;

public class CurrencyConverter {
	
	private double dValue;
	private double dollarCotation;

	public CurrencyConverter() {
	}
	
	public double dollarToReal() {
		return ((this.dValue * 0.06) + this.dValue) * this.dollarCotation;
	}

	public double getdValue() {
		return dValue;
	}

	public void setdValue(double dValue) {
		this.dValue = dValue;
	}

	public double getDollarCotation() {
		return dollarCotation;
	}

	public void setDollarCotation(double dollarCotation) {
		this.dollarCotation = dollarCotation;
	}

	@Override
	public String toString() {
		return "Amount to be paid in reais =  R$" + String.format("%.2f", dollarToReal()) + ".";
	}
	
	

}
