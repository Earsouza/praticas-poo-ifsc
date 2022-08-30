package principal;

import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaMain {

	public static void main(String[] args) {

		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		Pessoa p1 = new Pessoa();
		p1.setNome("Eduardo");
		p1.setCpf("09992211911");
		p1.setIdade(20);
		listaPessoas.add(p1);

		Pessoa p2 = new Pessoa();
		p2.setNome("Jessica");
		p2.setCpf("00000000000");
		p2.setIdade(19);
		listaPessoas.add(p2);

		Pessoa p3 = new Pessoa();
		p3.setNome("Maria");
		p3.setCpf("00000000000");
		p3.setIdade(26);
		listaPessoas.add(p3);

		Pessoa p4 = new Pessoa();
		p4.setNome("Adriana");
		p4.setCpf("58013890910");
		p4.setIdade(58);
		listaPessoas.add(p4);

		Pessoa p5 = new Pessoa();
		p5.setNome("Carlos");
		p5.setCpf("00000000000");
		p5.setIdade(15);
		listaPessoas.add(p5);

		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getCpf());
			System.out.println(pessoa.getIdade());

		}
	}

}
