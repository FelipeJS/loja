package br.com.plusbella.loja.produto.camiseta;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.plusbella.loja.produto.Produto;
import br.com.plusbella.loja.produto.estampa.Estampa;

public class Camiseta extends Produto {

	private static final long serialVersionUID = 7398907480520592760L;

	@ManyToOne
	@JoinColumn(name = "id_estampa", referencedColumnName = "id")
	private Estampa estampa;

	public Estampa getEstampa() {
		return estampa;
	}

	public void setEstampa(Estampa estampa) {
		this.estampa = estampa;
	}
}