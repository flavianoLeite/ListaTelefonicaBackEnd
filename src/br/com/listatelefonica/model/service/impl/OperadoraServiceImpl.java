package br.com.listatelefonica.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.listatelefonica.domain.Operadora;
import br.com.listatelefonica.model.dao.OperadoraDao;
import br.com.listatelefonica.model.service.OperadoraService;

public class OperadoraServiceImpl implements OperadoraService {

	@Inject
	private OperadoraDao dao;
	
	@Override
	public List<Operadora> listar() {
		return dao.listar();
	}

	@Override
	@Transactional
	public void remover(Integer id) {
		dao.remover(dao.findById(id));

	}

	@Override
	@Transactional
	public Operadora salvar(Operadora operadora) {
		return dao.salvarOuAtualizar(operadora);
	}

}
