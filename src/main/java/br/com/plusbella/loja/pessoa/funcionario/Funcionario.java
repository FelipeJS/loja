package br.com.plusbella.loja.pessoa.funcionario;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.plusbella.loja.pessoa.Pessoa;

@Entity
public class Funcionario extends Pessoa {

	private static final long serialVersionUID = 1693598067241638030L;

	@Column(name = "comissao", nullable = false)
	private BigDecimal comissao;

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}
}