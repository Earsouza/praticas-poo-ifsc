package pratica;

public abstract class Animal {

	private String nome;
	private String classe;

	Animal() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void imprime(){
		
	}
	public void falar() {
		System.out.println("O animal faz...");
	}

}
