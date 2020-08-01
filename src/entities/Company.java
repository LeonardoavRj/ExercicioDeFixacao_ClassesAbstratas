package entities;

public class Company extends Tax {

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anual_Income, Integer numberOfEmployees) {
		super(name, anual_Income);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public double Tax() {
		//Empresas que tem mais de 10 empregados pagam 14% de taxa e 
		//empresas que tem menos pagam 16% de taxa.
		if(numberOfEmployees < 10) {
			return anual_Income * 0.16;
		}else {
			return anual_Income * 0.14;
		}
	}
}
