package estoque;

import java.util.HashMap;

public class Estoque {
	HashMap<Integer,Caixa>caixas;
	
	
	public Estoque() {
		caixas=new HashMap<>();
	}
	
	public void cadastraCaixaPentagonal(int id,String personalização,double lado) {
		if (!this.caixas.containsKey(id)) {
			Formato formato = new Pentagonal(id, personalização, lado);
			caixas.put(id,new Caixa(formato,personalização));
		} }
	
	public void cadastraCaixaCircular(int id,String personalização,double raio) {
		if (!this.caixas.containsKey(id)) {
			Formato formato = new Circular(id, personalização, raio);
			caixas.put(id,new Caixa(formato,personalização));
		} }
	
	public void cadastraCaixaRetangular(int id,String personalização,double lado1,double lado2) {
		if (!this.caixas.containsKey(id)) {
			Formato formato = new Retangular(id, personalização, lado1, lado2);
			caixas.put(id,new Caixa(formato,personalização));
		} }
	
	public String representação(int id) {
		if (this.caixas.containsKey(id)){
			return this.caixas.get(id).representação();
		}
		else
			throw new IllegalArgumentException("id invalido");
	
	}
	
	public String calculaPreco(int id) {
		if (this.caixas.containsKey(id)) {
			return String.format("%.2f", this.caixas.get(id).calculaPreco()); 
			}
		else
			throw new IllegalArgumentException("id invalido"); }
	
	public void alteraPersonalizao(int id,String novaPersonalizao) {
		if (this.caixas.containsKey(id)) {
			this.caixas.get(id).alteraPersonalização(novaPersonalizao);
		}
		else
			throw new IllegalArgumentException("id invalido");
	}
	public boolean removeCaixa(int id) {
		if (this.caixas.containsKey(id)) {
			this.caixas.remove(id);
			return true;
		}
		else
			throw new IllegalArgumentException("id invalido"); }
	
	public int numerosCaixas() {
		return this.caixas.size();
	}
	
	public boolean consultaCaixa(int id,String personalizao,String formato) {
		boolean saida=false;
		if (this.caixas.containsKey(id)) 
			for (Caixa caixa:this.caixas.values()) {
				if (caixa.verifica(personalizao,formato))
					saida=true;
				}
		return saida; }

	public String totalRendimentos() {
		int saida=0;
		for (Caixa caixa : this.caixas.values()) {
			saida+=caixa.calculaPreco();
		}
		return String.format("%.2f", saida);
	}
	
	
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		estoque.cadastraCaixaCircular(1, "arte em tecido", 8);
		estoque.cadastraCaixaPentagonal(2, "colagem", 4);
		estoque.cadastraCaixaRetangular(3, "arte em tecido", 1.4, 1.5);
		estoque.alteraPersonalizao(1, "colagem");
		estoque.removeCaixa(1);
		System.out.println(estoque.consultaCaixa(2, "colagem", "Pentagonal"));
		
		
	}
	 
	

	
	
	
	
	
	

}
