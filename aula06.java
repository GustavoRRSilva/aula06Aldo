package p.o.o;

import java.util.Scanner;
public class aula06 {

	public static void main(String[] args) {
		int repeticao = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o c�digo do exame: ");
		int codigoExame = scan.nextInt();
		System.out.println("Insira seu nome: ");
		String nome = scan.next();
		System.out.println("Insira a sua glicose: ");
		int glicoseExame = scan.nextInt();
		
		Exame pacienteUm = new Exame(codigoExame, nome, glicoseExame);
		
		while(repeticao != 2) {
			System.out.println("Se deseja mostrar os dados digite 1\nSe deseja parar digite 2");
			repeticao = scan.nextInt();
			if(repeticao == 1 ) {
				System.out.println("O seu c�digo do exame �: " + pacienteUm.getIdentificador());
				System.out.println("O seu nome �: " + pacienteUm.getNomePaciente());
				System.out.println("A sua glicose �: " + pacienteUm.getGlicose());
				System.out.println("O resultado do exame �: " + pacienteUm.diagnostico(glicoseExame));
			}
			else if(repeticao > 2 || repeticao < 1){
			System.out.println("Digite um valor valido");
			}
		}
	}

}
