package br.com.plusbella.loja.pessoa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import br.com.plusbella.loja.util.BaseEntity;

@MappedSuperclass
public abstract class Pessoa extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 2566396452321613239L;

	@Column(name = "cpf", nullable = false, length = 11)
	private String cpf;

	@Column(name = "nome", nullable = false, length = 500)
	private String nome;

	@Column(name = "telefone", nullable = true, length = 12)
	private String telefone;

	@Column(name = "email", nullable = true, length = 500)
	private String email;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}