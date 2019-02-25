package br.com.plusbella.loja.produto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.plusbella.loja.util.BaseEntity;

@Entity
public class Produto extends BaseEntity {

	private static final long serialVersionUID = -8864551329922643589L;

	@Column(name = "nome", nullable = false, length = 200)
	private String nome;

	@Column(name = "genero", nullable = true, length = 20)
	private String genero;

	@Column(name = "tamanho", nullable = true, length = 10)
	private String tamanho;

	@Column(name = "custo", nullable = false, precision = 8, scale = 2)
	private BigDecimal custo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
}