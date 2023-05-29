package exes;

public class DVD extends ItemBiblioteca {
	private String diretor;
	private int duracao;
	private static final int TIPO = 2;
	public DVD(String titulo, String publi, String diretor, int duracao) {
		super.setTIPO(this.TIPO);
		this.setTitulo(titulo);
		this.setAnoPublicação(publi);
		this.diretor = diretor;
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		String disponibilidade = (this.isDisponivel()) ? "Disponível" : "Indisponível";
	    return "\nDVD: " + this.getTitulo()+
	           "\nDiretor: " + diretor +
	           "\nAno de Publicação: " + this.getAnoPublicação() +
	           "\nDuração: " + duracao +
	           "\nDisponibilidade: " + disponibilidade;
	}
	
}
