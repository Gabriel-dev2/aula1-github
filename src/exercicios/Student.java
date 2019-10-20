package exercicios;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Double> nota = new ArrayList<Double>();
    
	
	private String msg = "";
	public Student() {
	}

	public double calculateNotes() {
		double result = 0;
		result = this.nota.get(0) + this.nota.get(1) + this.nota.get(2); 
		return result;
	}

	public void aproveCheck(double finalNote) {
		double percentage = 100 * 0.6; 
		if(finalNote < percentage){
			double result = percentage - finalNote;
			this.msg = "FAILED \n" + "MISSING " + String.format("%.2f", result) + " POINTS";
		} else {
			this.msg = "PASS";
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getNota() {
		return nota;
	}

	public void setNota(ArrayList<Double> nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f", calculateNotes()) + "\n" + this.msg;
	}

    

}
