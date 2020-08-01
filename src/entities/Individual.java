package entities;

public class Individual extends Tax {

	private double health_Expenditure;
	
	public Individual() {
		super();
	}
	public Individual(String name, Double anual_Income, double health_Expenditure) {
		super(name, anual_Income);
		this.health_Expenditure = health_Expenditure;
	}

	public double getHealth_Expenditure() {
		return health_Expenditure;
	}
	public void setHealth_Expenditure(double health_Expenditure) {
		this.health_Expenditure = health_Expenditure;
	}
	
	@Override
	public double Tax() {
		// O calculo da Tax pessoa fisica e feito da seguinte forma: 
		//Pessoas que ganham abaixo de $20.000,00 pagam 15% de Tax,
		//pessoas que ganham de $20.000,00 em diante pagam 25% de Tax.
		double basicTax;
		if(anual_Income < 20000.00) {
			basicTax = anual_Income * 0.15 - getHealth_Expenditure() * 0.50;			
		}
		else {
	 	    basicTax = anual_Income * 0.25 - getHealth_Expenditure() * 0.50;
	    }
		if(basicTax<0) {
			basicTax=0;
			return basicTax;
		}else {
			return basicTax;
		}
	}
}
