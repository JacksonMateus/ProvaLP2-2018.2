package estoque;

public class Pentagonal extends Formato {
	private double lado;
	private double altura;
	
	public Pentagonal(int id, String personalização,double lado) {
		super(id, personalização);
		this.lado=lado;
		this.altura=(lado/2 * Math.sqrt(5) + 2 * Math.sqrt(5));
	}

	@Override
	public String toString() {
		return "Caixa com <"+super.getPersonalização()+"> custa R$ <"+String.format("%.1f", preço())+"> Formato <Pentagonal>."; 
	}
	public double areaTotal() {
		return 5.0 * (lado * altura)/2.0;
	}

	@Override
	public double preço() {
		return 0.1*areaTotal();
	}

	@Override
	public String formato() {
		return "Pentagonal";
	}
}
