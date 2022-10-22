package pratica;

public class Papagaio extends Ave {
	private String vocabulario;

	Papagaio(String nome, String classe, String vocabulario) {
		this.setNome(nome);
		this.setClasse(classe);
		this.vocabulario = vocabulario;

	}

	public String getVocabulario() {
		return vocabulario;
	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}

	public void falar() {
		System.out.printf("O papagaio fala");
	}

}
