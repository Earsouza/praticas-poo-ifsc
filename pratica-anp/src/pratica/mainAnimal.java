package pratica;

import java.util.ArrayList;

public class mainAnimal {

	public static void main(String[] args) {

		Papagaio papagaio = new Papagaio("Papagaio-do-mangue", "Ave", "Espanhol");
		BemTeVi bemtevi = new BemTeVi("Bem-te-vi-da-copa", "Ave");
		Vaca vaca = new Vaca("Holândes", "Mamífero", true);
		Cachorro cachorro = new Cachorro("Labrador", "Mamífero", true, false, true, 40);
		ArrayList<Papagaio> listaPapagaio = new ArrayList<>();
		listaPapagaio.add(papagaio);
		ArrayList<BemTeVi> listaBemtevi = new ArrayList<>();
		listaBemtevi.add(bemtevi);
		ArrayList<Vaca> listaVaca = new ArrayList<>();
		listaVaca.add(vaca);
		ArrayList<Cachorro> listaCachorro = new ArrayList<>();
		listaCachorro.add(cachorro);

		System.out.println("\nPapagaios\n");

		for (Papagaio p1 : listaPapagaio) {
			System.out.println("Nome: " + p1.getNome());
			System.out.println("Classe: " + p1.getClasse());
			System.out.println("Vocabulario: " + p1.getVocabulario());
			papagaio.falar();
			papagaio.voar(p1.getNome());

		}
		System.out.println("\nBem-Te-Vi\n");

		for (BemTeVi b1 : listaBemtevi) {
			System.out.println("Nome: " + b1.getNome());
			System.out.println("Classe: " + b1.getClasse());
			bemtevi.falar();
			bemtevi.voar(b1.getNome());

		}
		System.out.println("\nVacas\n");

		for (Vaca v1 : listaVaca) {
			System.out.println("Nome: " + v1.getNome());
			System.out.println("Classe: " + v1.getClasse());
			System.out.println("Ordenha? " + v1.getPermiteOrdenhar());
			vaca.falar();
			vaca.ordenhar();
			vaca.correr(v1.getNome());;

		}
		System.out.println("\nCachorros\n");
		for (Cachorro c1 : listaCachorro) {
			System.out.println("Nome: " + c1.getNome());
			System.out.println("Classe: " + c1.getClasse());
			System.out.println("Late? "+ c1.getTipoLatido());
			System.out.println("Late alto: " + c1.getLateAlto());
			System.out.println("Late baixo: " + c1.getLateBaixo());
			System.out.println("Velocidade máxima: " + c1.getVelocidade() + "km/h");
			cachorro.correr(c1.getNome());
			cachorro.falar();
			
		}
	}

}
