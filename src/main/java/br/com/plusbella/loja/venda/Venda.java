package br.com.plusbella.loja.venda;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.com.plusbella.loja.pessoa.cliente.Cliente;
import br.com.plusbella.loja.produto.Produto;
import br.com.plusbella.loja.util.BaseEntity;

@Entity
public class Venda extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -3181162225946201590L;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "venda_produto",
    joinColumns = @JoinColumn(name = "id_venda", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_produto", referencedColumnName = "id"))
	private List<Produto> produtos;
    
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;

	@Column(name = "preco", nullable = false)
	private BigDecimal preco;

	@Column(name = "total", nullable = false)
	private BigDecimal total;

	@Column(name = "desconto", nullable = false)
	private BigDecimal desconto;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getDesconto() {
		return desconto;
	}

	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
}