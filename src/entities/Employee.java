package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
	
    
    public Employee() {}
    
    public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}
    
    public Double increaseSalary(int id,double percent) {
    	double calc = this.salary * (percent/100);
		this.salary += calc;
		return this.salary;
    }
    
}
