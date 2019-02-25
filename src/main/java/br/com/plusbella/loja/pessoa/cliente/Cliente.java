package br.com.plusbella.loja.pessoa.cliente;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.plusbella.loja.pessoa.Pessoa;

@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa {

	private static final long serialVersionUID = 7887557194545492702L;

}