package pratica;

public class BemTeVi extends Ave {

	BemTeVi(String nome, String classe) {
		this.setNome(nome);
		this.setClasse(classe);

	}

	public void falar() {
		System.out.printf("O Bem-te-vi pia");
	}

}
