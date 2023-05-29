package exes;

import java.util.ArrayList;

public class Biblioteca {
	private String endereco;
	private String cep;
	private static ArrayList<ItemBiblioteca> itensNaBiblioteca = new ArrayList<>();
	
	public void adicionarItem(ItemBiblioteca item) {
		itensNaBiblioteca.add(item);
		System.out.println("ITEM ADICIONADO!");
	}
	
	public void buscarTudo() {
		System.out.println("#####################################");
		System.out.println("########  AQUI ESTÁ TUDO  ###########");
		System.out.println("#####################################");
		System.out.println();
		for (ItemBiblioteca itemBiblioteca : itensNaBiblioteca) {
			System.out.println(itemBiblioteca.toString()); 
		}
	}
	public void buscarLivros() {
		System.out.println("#####################################");
		System.out.println("###### AQUI ESTÃO OS LIVROS  ########");
		System.out.println("#####################################");
		System.out.println();
		for (ItemBiblioteca itemBiblioteca : itensNaBiblioteca) {
			if(itemBiblioteca.getTIPO()== 1)
				System.out.println(itemBiblioteca.toString()); 
		}
	}
	public void buscarDvds() {
		System.out.println("#####################################");
		System.out.println("######   AQUI ESTÃO OS DVDs  ########");
		System.out.println("#####################################");
		System.out.println();
		for (ItemBiblioteca itemBiblioteca : itensNaBiblioteca) {
			if(itemBiblioteca.getTIPO()== 2)
				System.out.println(itemBiblioteca.toString()); 
		}
	}
}
