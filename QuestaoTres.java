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

		Exame pacienteUm = new Exame(codigoExame[0], nome[0], glicoseExame[0]);
		Exame pacienteDois = new Exame(codigoExame[1], nome[1], glicoseExame[1]);
		Exame pacienteTres = new Exame(codigoExame[2], nome[2], glicoseExame[2]);
		while(repeticao != 2) {
			System.out.println("Se deseja mostrar os dados digite 1\nSe deseja parar digite 2");
			repeticao = scan.nextInt();
			if(repeticao == 1 ) {
				System.out.println("\nDigite o codigo do exame para saber os dados do paciente");
				codPaciente = scan.nextInt();
				if(codPaciente == 0) {
					System.out.println("O seu código do exame é: " + pacienteUm.getIdentificador());
					System.out.println("O seu nome é: " + pacienteUm.getNomePaciente());
					System.out.println("A sua glicose é: " + pacienteUm.getGlicose());
					System.out.println("O resultado do exame é: " + pacienteUm.diagnostico(glicoseExame[0]));
				}
				else if(codPaciente == 1) {
					System.out.println("O seu código do exame é: " + pacienteDois.getIdentificador());
					System.out.println("O seu nome é: " + pacienteDois.getNomePaciente());
					System.out.println("A sua glicose é: " + pacienteDois.getGlicose());
					System.out.println("O resultado do exame é: " + pacienteDois.diagnostico(glicoseExame[0]));
				}
				else if(codPaciente == 2) {
					System.out.println("O seu código do exame é: " + pacienteTres.getIdentificador());
					System.out.println("O seu nome é: " + pacienteTres.getNomePaciente());
					System.out.println("A sua glicose é: " + pacienteTres.getGlicose());
					System.out.println("O resultado do exame é: " + pacienteTres.diagnostico(glicoseExame[0]));
				}
				else {
					System.out.println("Digite um valor válido");
				}
			}
			else if(repeticao > 2 || repeticao < 1){
			System.out.println("\nDigite um valor valido");
			}
		}
		
		
		
	}

}
