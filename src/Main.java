import java.util.Scanner;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Scanner entrada = new Scanner(System.in);
		int opc;
		
		System.out.println("-----SISBIBLI-----\n");
		System.out.println("Bem Vindo ao sistema bibliotec�rio!\n");
				
		do {
			
			System.out.println("1 - Cadastrar novo usu�rio\n"
					+ "2 - Excluir usu�rio cadastrado\n"
					+ "3 - Alterar informa��es de um usu�rio\n"
					+ "4 - Visualizar usu�rios cadastrados\n"
					+ "5 - Cadastrar novo livro\n"
					+ "6 - Excluir livro cadastrado\n"
					+ "7 - Visualizar livros cadastrados\n");
			System.out.print("Digite sua op��o: ");
			
			
			opc = entrada.nextInt();
			entrada.nextLine();
			System.out.println();
			
			
			switch (opc){
				
				case 1:
					System.out.println("***Cadstro de usu�rio***\n");
					
					System.out.print("Nome completo do usu�rio: ");
					String nome1 = entrada.nextLine();
					
					
					System.out.print("Data de nascimento do usu�rio (Ex.: 01/01/2001): ");
					String dataNas1 = entrada.nextLine();
					
					
					System.out.print("CPF do usu�rio: ");
					String cpf1 = entrada.nextLine();
					
					
					System.out.print("Endere�o do usu�rio: ");
					String endereco1 = entrada.nextLine();					
					
					
					Usuario usuario = new Usuario(nome1, dataNas1, endereco1, cpf1);
					
					System.out.println();
					
					System.out.println("Nome: "+usuario.getNome());
					System.out.println("CPF: "+usuario.getCpf());
					System.out.println("Endere�o: "+usuario.getEndereco());
					System.out.println("Data de nascimento: "+usuario.getDataNas());
					
					break;
				case 2:
					System.out.println("***Exclus�o de usu�rio***\n");
					break;
				case 3:
					System.out.println("***Alterar usu�rio***\n");
					break;
				case 4:
					System.out.println("***Cadastrar livro***\n");
					break;
				case 5:
					System.out.println("***Visualizar usu�rios***\n");
					break;
				case 6:
					System.out.println("***Excluir livro***\n");
					break;
				case 7:
					System.out.println("***Visualizar livros cadastrados***\n");
					break;
				default:
					System.out.println("Op��o inv�lida!\nPor favor, digite uma op��o v�lida!\n");
			}
		
		}while(opc > 6 || opc < 1);
		

	}

}
