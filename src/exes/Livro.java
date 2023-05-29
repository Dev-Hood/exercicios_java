package exes;

public class Livro extends ItemBiblioteca {
	private String autor;
	private int numeroPaginas;
	private static final int TIPO = 1;
	
	public Livro(String titulo, String publi, String autor, int numeroPag){
		super.setTIPO(this.TIPO);
		super.setTitulo(titulo);
		super.setAnoPublicação(publi);
		this.autor = autor;
		this.numeroPaginas = numeroPag;
	}
	
	@Override
	public String toString() {
		String disponibilidade = (this.isDisponivel()) ? "Disponível" : "Indisponível";
	    return "\nLivro: " + this.getTitulo()+
	           "\nAutor: " + autor +
	           "\nAno de Publicação: " + this.getAnoPublicação() +
	           "\nNúmero de Páginas: " + numeroPaginas +
	           "\nDisponibilidade: " + disponibilidade +
	           "\n============================================"
	           ;
	}
}
