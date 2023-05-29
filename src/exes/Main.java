package exes;

public class Main {

	public static void main(String[] args) {
		Livro l1 = new Livro("Senhor dos Aneis","20/05/88", "Tolkien", 300);
		Livro l2 = new Livro("Senhor dos Aneis - 2","01/02/89", "Tolkien", 300);
		Livro l3 = new Livro("Senhor dos Aneis - 3", "23/05/88", "Tolkien", 300);
		DVD d1 = new DVD("Assassins Creed", "05/03/2023", "Ubisoft", 130);
		
		
		Usuario tallys = new Usuario("tallys");
		
		tallys.emprestarItem(l1);
		tallys.emprestarItem(l2);
		Biblioteca b = new Biblioteca();
		b.adicionarItem(d1);
		b.adicionarItem(l1);
		b.adicionarItem(l2);
		b.adicionarItem(l3);
		b.buscarLivros();

	}

}
