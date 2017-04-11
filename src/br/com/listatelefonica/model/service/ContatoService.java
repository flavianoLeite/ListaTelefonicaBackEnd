package br.com.listatelefonica.model.service;

import java.util.List;

import br.com.listatelefonica.domain.Contato;

public interface ContatoService {
	
	List<Contato> listar();
	void remover(Integer id);
	Contato salvar(Contato contato);
}
