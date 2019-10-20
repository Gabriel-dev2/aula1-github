package exercicios;

public class Rectangle {
	
	private double width;
	private double heigth;

	public Rectangle() {
	}
	
	public double area() {
		double answer = (double) this.width * this.heigth;
		return answer;
	}
	
	public double perimeter() {
		double answer = (double) 2 * (this.width + this.heigth);
		return answer;
	}
	
	public double diagonal() {
		double answer = (double) Math.sqrt((this.width * this.width) + (this.heigth * this.heigth));
		return answer;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	

}
