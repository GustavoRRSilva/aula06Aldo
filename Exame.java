package p.o.o;

public class Exame {
	private int identificador;
	private String nomePaciente;
	private int glicose;
	
	public String diagnostico(int glicose){
		if(glicose <= 99) {
			return "Normal";
		}
		else if(glicose >= 100 && glicose <= 125) {
			return "Pré-diabétes";
		}
		else{
			return "Diabetes";
		}
	}
	
	public Exame(int identificador, String nomePaciente, int glicose) {
		this.identificador = identificador;
		this.nomePaciente = nomePaciente;
		this.glicose = glicose;
		diagnostico(glicose);
	}


	public int getGlicose() {
		return glicose;
	}
	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	
	
}
