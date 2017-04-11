package br.com.listatelefonica.model.dao;

import java.util.List;

import br.com.listatelefonica.domain.Operadora;

public interface OperadoraDao {
	
	Operadora findById(Integer id);
	List<Operadora> listar();
	void remover(Operadora operadora);
	Operadora salvarOuAtualizar(Operadora operadora);

}
