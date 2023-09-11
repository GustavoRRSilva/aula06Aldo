package p.o.o;

import java.util.Scanner;

public class QuestaoTres {

	public static void main(String[] args) {
		int repeticao = 0;
		int codPaciente = 0;
		Scanner scan = new Scanner(System.in);
		int[] codigoExame = new int[3];
		String[] nome = new String[3];
		int[] glicoseExame = new int[3];
		
		for (int i = 0; i < glicoseExame.length; i++) {
			System.out.printf("Digite o nome do paciente %d: ", i);
			nome[i] = scan.next();
			System.out.printf("Digite o codigo do paciente %d: ", i);
			codigoExame[i] = scan.nextInt();
			System.out.printf("Digite o nivel de glicose do paciente %d: ", i);
			glicoseExame[i] = scan.nextInt();
			
		}
		Exame[] pacientes = new Exame[3];
		pacientes[0]= new Exame(codigoExame[0], nome[0], glicoseExame[0]);
		pacientes[1]= new Exame(codigoExame[1], nome[1], glicoseExame[1]);
		pacientes[2]= new Exame(codigoExame[2], nome[2], glicoseExame[2]);

       
		while(repeticao != 2) {
			System.out.println("Se deseja mostrar os dados digite 1\nSe deseja parar digite 2");
			repeticao = scan.nextInt();
			if(repeticao == 1 ) {
				System.out.println("\nDigite o codigo do exame para saber os dados do paciente");
				codPaciente = scan.nextInt();
				if(codPaciente >= 0 && codPaciente <=2 ) {
					System.out.println("O seu c�digo do exame �: " + pacientes[codPaciente].getIdentificador());
					System.out.println("O seu nome �: " + pacientes[codPaciente].getNomePaciente());
					System.out.println("A sua glicose �: " + pacientes[codPaciente].getGlicose());
					System.out.println("O resultado do exame �: " + pacientes[codPaciente].diagnostico(glicoseExame[codPaciente]));
				}
				else {
					System.out.println("Digite um valor v�lido");
				}
			}
			else if(repeticao > 2 || repeticao < 1){
			System.out.println("\nDigite um valor valido");
			}
		}
		
		
		
	}

}
