package estoque;

public class Retangular extends Formato{
	private double lado1;
	private double lado2;

	public Retangular(int id, String personalização,double lado1,double lado2) {
		super(id, personalização);
		this.lado1=lado1;
		this.lado2=lado2;
	}

	@Override
	public String toString() {
		return "Caixa com <"+super.getPersonalização()+"> custa R$ <"+String.format("%.1f", preço())+"> Formato <Retangular>."; 
	}
	public double areaTotal() {
		return lado1 * lado2;
	}

	@Override
	public double preço() {
		return 0.1*areaTotal(); }

	@Override
	public String formato() {
		return "Retangular";
	}
}