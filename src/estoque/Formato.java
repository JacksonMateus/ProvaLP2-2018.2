package estoque;

public abstract class Formato {
	private int id;
	private String personalização;
	
	public Formato(int id,String personalizacao) {
		this.id = id;
		this.personalização=personalizacao;
		
	}
	
	public abstract String toString();
	public abstract double preço();

	public String getPersonalização() {
		return personalização;
	}

	public void setPersonalização(String personalização) {
		this.personalização = personalização;
	}
	
	public abstract String formato();
	

}
