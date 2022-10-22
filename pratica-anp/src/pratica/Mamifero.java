package pratica;

public class Mamifero extends Animal {
	private int velocidade;

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public void correr(String nome) {
		System.out.println("O " + nome + " gosta de correr ");

	}

}
