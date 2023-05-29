package exes;

public class ItemBiblioteca {
	private String titulo;
	private String anoPublicação;
	private boolean disponivel = true;
	private int TIPO;
	public void emprestar() {
		this.disponivel = false;
	}
	
	public void devolver() {
		this.disponivel = true;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnoPublicação() {
		return anoPublicação;
	}

	public void setAnoPublicação(String anoPublicação) {
		this.anoPublicação = anoPublicação;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	public int getTIPO() {
		return TIPO;
	}
	public void setTIPO(int tipo) {
		this.TIPO = tipo;
	}

	public String toString() {
		return "nome: " + this.titulo + "\n"
				+ "data publicação:" + this.anoPublicação+ "\n"+
				"Disponível:" + this.disponivel;			
	}
}
