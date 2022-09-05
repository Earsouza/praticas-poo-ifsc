package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Pessoa;

public class PessoaMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		int opc = 0;

		do {
			System.out.println("##ESCOLHA UMA OPÇÃO##\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Listar \n");
			System.out.println("Digite uma opção: ");
			opc = scan.nextInt();

			switch (opc) {

			case 1:

				 Pessoa pessoa = new Pessoa (nome, idade, cpf);

				System.out.println("Cadastro\n");

				System.out.println("Nome: ");
				String nome = scan.nextLine();

				System.out.println("Idade: ");
				int idade = scan.nextInt();

				System.out.println("CPF: ");
				String cpf = scan.nextLine();

			case 2:
				System.out.println("Atualizar");

			case 3:
				System.out.println("Listar");
				
				for (Pessoa p1 : listaPessoas) {
					System.out.println(p1.getNome());
					System.out.println(p1.getCpf());
					System.out.println(p1.getIdade());

			default:

				System.out.println("Opção inválida");

			}
		} while (opc == 0);
		System.out.println("Encerrando...");
	}

}
