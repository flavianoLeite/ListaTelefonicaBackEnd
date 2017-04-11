package br.com.listatelefonica.model.service;

import java.util.List;

import br.com.listatelefonica.domain.Operadora;

public interface OperadoraService {
	
	List<Operadora> listar();
	void remover(Integer id);
	Operadora salvar(Operadora operadora);
}
