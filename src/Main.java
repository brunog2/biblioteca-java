import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Scanner entrada = new Scanner(System.in);
		int opc;
		
		System.out.println("-----SISBIBLI-----\n");
		System.out.println("Bem Vindo ao sistema bibliotecário!\n");
				
		do {
			
			System.out.println("1 - Cadastrar novo usuário\n"
					+ "2 - Excluir usuário cadastrado\n"
					+ "3 - Alterar informações de um usuário\n"
					+ "4 - Visualizar usuários cadastrados\n"
					+ "5 - Cadastrar novo livro\n"
					+ "6 - Excluir livro cadastrado\n"
					+ "7 - Visualizar livros cadastrados\n");
			System.out.print("Digite sua opção: ");
			
			
			opc = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			
			
			switch (opc){
				
				case 1:
					System.out.println("***Cadstro de usuário***\n");
					
					System.out.print("Nome completo do usuário: ");
					String nome1 = entrada.nextLine();
					
					
					System.out.print("Data de nascimento do usuário (Ex.: 01/01/2001): ");
					String dataNas1 = entrada.nextLine();
					
					
					System.out.print("CPF do usuário: ");
					String cpf1 = entrada.nextLine();
					
					
					System.out.print("Endereço do usuário: ");
					String endereco1 = entrada.nextLine();					
					
					
					Usuario usuario = new Usuario(nome1, dataNas1, endereco1, cpf1);
					
					System.out.println();
					
					System.out.println("Nome: "+usuario.getNome());
					System.out.println("CPF: "+usuario.getCpf());
					System.out.println("Endereço: "+usuario.getEndereco());
					System.out.println("Data de nascimento: "+usuario.getDataNas());
					
					break;
				case 2:
					System.out.println("***Exclusão de usuário***\n");
					break;
				case 3:
					System.out.println("***Alterar usuário***\n");
					break;
				case 4:
					System.out.println("***Cadastrar livro***\n");
					break;
				case 5:
					System.out.println("***Visualizar usuários***\n");
					break;
				case 6:
					System.out.println("***Excluir livro***\n");
					break;
				case 7:
					System.out.println("***Visualizar livros cadastrados***\n");
					break;
				default:
					System.out.println("Opção inválida!\nPor favor, digite uma opção válida!\n");
			}
		
		}while(opc > 6 || opc < 1);
		

	}

}
