package pratica;

public class Cachorro extends Mamifero {

	private Boolean tipoLatido;
	private Boolean lateAlto;
	private Boolean lateBaixo;

	Cachorro(String nome, String classe, Boolean tipoLatido, Boolean lateAlto, Boolean lateBaixo, int Velocidade) {
		this.setClasse(classe);
		this.setNome(nome);
		this.tipoLatido = tipoLatido;
		this.lateAlto = lateAlto;
		this.lateBaixo = lateBaixo;
		this.setVelocidade(Velocidade);

	}

	public Boolean getTipoLatido() {
		return tipoLatido;
	}

	public void setTipoLatido(Boolean tipoLatido) {
		this.tipoLatido = tipoLatido;
	}

	public void falar() {
		System.out.println("Cachorro late");
	}

	public Boolean getLateAlto() {
		return lateAlto;
	}

	public void setLateAlto(Boolean lateAlto) {
		this.lateAlto = lateAlto;
	}

	public Boolean getLateBaixo() {
		return lateBaixo;
	}

	public void setLateBaixo(Boolean lateBaixo) {
		this.lateBaixo = lateBaixo;
	}

}
