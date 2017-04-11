package br.com.listatelefonica.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAnyElement;

@Entity
@Table(name="CONTATO")
public class Contato implements Serializable {
		
	private static final long serialVersionUID = -2040427849589629010L;
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String telefone;
	private Date data;
	private String cor;
	
	@XmlAnyElement(lax=false)
	@OneToOne	
	private Operadora operadora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Operadora getOperadora() {
		return operadora;
	}
	public void setOperadora(Operadora operadora) {
		this.operadora = operadora;
	}
	
	
	
	
}
