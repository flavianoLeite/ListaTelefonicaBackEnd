package br.com.listatelefonica.model.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.listatelefonica.domain.Contato;
import br.com.listatelefonica.model.dao.ContatoDao;
import br.com.listatelefonica.model.service.ContatoService;

public class ContatoServiceImpl implements ContatoService {

	@Inject
	private ContatoDao dao;
	
	@Override
	public List<Contato> listar() {
		return dao.listar();
	}

	@Override
	@Transactional
	public void remover(Integer id) {
		dao.remover(dao.findById(id));

	}

	@Override
	@Transactional
	public Contato salvar(Contato contato) {
		return dao.salvarOuAtualizar(contato);
	}

}
