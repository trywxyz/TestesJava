package SA3;

import java.util.ArrayList;

public class Produto extends Venda {


	boolean prod;
	
	private String nome;
	private double preco;
	private boolean quantidadeEstoque;
	//private int quantidadeestoque = 0;
	private ArrayList<Produto> listavenda;
	
	//public boolean verificarEstoque(Produto prod)
	{
		
	}
	public Produto() {
		super();
	}
	public Produto(String nome, double preco, boolean quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public double setPreco(double preco) {
		
		return this.preco = preco;
	}
	public boolean getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(boolean quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public ArrayList<Produto> getListavenda() {
		return listavenda;
	}
	public void setListavenda(ArrayList<Produto> listavenda) {
		this.listavenda = listavenda;
	}
}

