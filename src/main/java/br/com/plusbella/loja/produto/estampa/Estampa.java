package br.com.plusbella.loja.produto.estampa;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.plusbella.loja.produto.Produto;

@Entity
public class Estampa extends Produto {

	private static final long serialVersionUID = -3986819465018948469L;

	/**
	 * Tipo Sublimacao ou Silkagem
	 */
	@Column(name = "tipo", nullable = false, length = 200)
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}