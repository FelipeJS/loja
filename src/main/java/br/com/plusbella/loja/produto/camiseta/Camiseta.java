package br.com.plusbella.loja.produto.camiseta;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.plusbella.loja.produto.Produto;
import br.com.plusbella.loja.produto.estampa.Estampa;

@Entity
public class Camiseta extends Produto {

	private static final long serialVersionUID = 7398907480520592760L;

	@OneToMany
	@JoinColumn(name = "id_estampa")
	private Estampa estampa;

	public Estampa getEstampa() {
		return estampa;
	}

	public void setEstampa(Estampa estampa) {
		this.estampa = estampa;
	}

}