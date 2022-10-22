package pratica;

public class Vaca extends Mamifero {

	private Boolean permiteOrdenhar;
	
	Vaca(String nome, String classe, Boolean permiteOrdenhar) {
		
		this.setNome(nome);
		this.setClasse(classe);
		this.permiteOrdenhar = permiteOrdenhar;

	}

	public Boolean getPermiteOrdenhar() {
		return permiteOrdenhar;
	}

	public void setPermiteOrdenhar(Boolean permiteOrdenhar) {
		this.permiteOrdenhar = permiteOrdenhar;
	}

	public void ordenhar() {
		System.out.println("A vaca está sendo ordenhada");
	}

	public void falar() {
		System.out.println("A vaca faz mu");

	}

}
