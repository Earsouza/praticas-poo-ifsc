package principal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Pessoa;

public class PrincipalPessoa {

	public static void main(String[] args) {

		String nome;
		int idade;
		String cpf;
		int opc = 0;

		ArrayList<Pessoa> listaPessoas = new ArrayList<>();

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("********ESCOLHA UMA OPÇÃO********\n");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Atualizar");
			System.out.println("3 - Listar \n");
			System.out.println("Digite uma opção: ");
			
			try {
				opc = scan.nextInt();
			} catch (Exception e) {
				System.out.println("Opção Inválida.");
			}
			System.out.println("\n\n");

			switch (opc) {

			case 1:

				System.out.println("********CADASTRO********\n");

				System.out.println("Nome: ");
				nome = scan.next();

				System.out.println("Idade: ");
				idade = scan.nextInt();

				System.out.println("CPF: ");
				cpf = scan.next();

				Pessoa pessoa = new Pessoa(nome, idade, cpf);

				listaPessoas.add(pessoa);
				break;

			case 2:
				int opcao;
				int cont = 0;
				System.out.println("********ATUALIZAR********\n\n");

				System.out.println("Qual usuário desejas atualizar?\n");

				for (Pessoa p1 : listaPessoas) {
					cont += 1;
					System.out.println("Opção: " + cont);
					System.out.println("Nome: " + p1.getNome());
					System.out.println("CPF: " + p1.getCpf());
					System.out.println("Idade:" + p1.getIdade() + "\n\n");
				}

				System.out.println("Informe a opção: ");
				opcao = scan.nextInt();
				System.out.println("Informe os novos valores:");

				System.out.println("Nome: ");
				nome = scan.next();

				System.out.println("Idade: ");
				idade = scan.nextInt();

				System.out.println("CPF: ");
				cpf = scan.next();

				pessoa = new Pessoa(nome, idade, cpf);

				listaPessoas.set((opc - 1), pessoa);

				break;

			case 3:
				System.out.println("********LISTAR********\n\n");

				for (Pessoa p1 : listaPessoas) {
					System.out.println("Nome: " + p1.getNome());
					System.out.println("CPF: " + p1.getCpf());
					System.out.println("Idade:" + p1.getIdade() + "\n\n");
				}
				break;
			default:
				if (opc != 0) {
					System.out.println("Opção inválida");
				}
				break;

			}

		} while (opc != 0);
		System.out.println("Encerrando...");

		scan.close();
	}

}
