package estoque;

public class Circular extends Formato{
	private double raio;

	public Circular(int id, String personalização,double raio) {
		super(id, personalização);
		this.raio=raio; }
	

	@Override
	public String toString() {
		return "Caixa com <"+super.getPersonalização()+"> custa R$ <"+String.format("%.1f", preço())+"> Formato <Circular>."; 
	}
	public double areaTotal() {
		return 3.14  * (raio * raio);
	}

	@Override
	public double preço() {
		return 0.1*areaTotal();
	}
	
	@Override
	public String formato() {
		return "Circular";
	}
}
