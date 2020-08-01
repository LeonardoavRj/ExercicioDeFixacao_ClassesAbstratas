package entities;

public abstract class Tax {
	protected String name;
	protected Double anual_Income;
	
	public Tax() {
		}

	public Tax(String name, Double anual_Income) {
		this.name = name;
		this.anual_Income = anual_Income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnual_Income() {
		return anual_Income;
	}

	public void setAnual_Income(Double anual_Income) {
		this.anual_Income = anual_Income;
	}
	public abstract double Tax() ;
		
	
	
}
