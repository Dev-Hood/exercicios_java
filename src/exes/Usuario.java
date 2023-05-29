package exes;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<ItemBiblioteca> itensEmprestados = new ArrayList<ItemBiblioteca>();
	
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public void emprestarItem(ItemBiblioteca item) {
		if(item.isDisponivel()){
			itensEmprestados.add(item);
			item.emprestar();
		}else {
			System.out.println("Item já está emprestado");
		}
		
	}
	
	public void devolverItem(ItemBiblioteca item) {
		if(!item.isDisponivel()){
			itensEmprestados.remove(item);
			item.devolver();
		}else {
			System.out.println("Item já foi devolvido");
		}
		
	}
	
	@Override
	public String toString() {
		String texto = "";
		
		for (ItemBiblioteca item : itensEmprestados) {
			
			 texto+=item.toString();
		};
		
		return "Nome:" + this.nome +
				"\nItens emprestados: "+ texto;
	}
}
