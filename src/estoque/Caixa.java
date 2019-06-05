package estoque;

public class Caixa {
	private Formato formato;
	private String personalizao;

	public Caixa(Formato formato,String personalizao) {
		this.formato = formato;
		this.personalizao = personalizao;
	}
	public boolean verifica(String personalizao,String formato) {
		return personalizao.equals(personalizao) && this.formato.formato().equals(formato);
	}
	
	public String representação() {
		return formato.toString();
	}
	public double calculaPreco() {
		return formato.preço();
	}
	public void alteraPersonalização(String personalizao) {
		formato.setPersonalização(personalizao);
	}
	
	
	
	
	
	

}
