package br.com.listatelefonica.model.dao;

import java.util.List;

import br.com.listatelefonica.domain.Contato;

public interface ContatoDao {
	
	Contato findById(Integer id);
	List<Contato> listar();
	void remover(Contato contato);
	Contato salvarOuAtualizar(Contato contato);

}
