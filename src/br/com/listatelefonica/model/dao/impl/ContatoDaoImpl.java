package br.com.listatelefonica.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.listatelefonica.domain.Contato;
import br.com.listatelefonica.model.dao.ContatoDao;

public class ContatoDaoImpl implements ContatoDao {

	@PersistenceContext(unitName = "ListaTelefonicaPU")
	private EntityManager em;
	
	@Override
	public Contato findById(Integer id) {
		return em.find(Contato.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar() {
		Query query = em.createQuery("from Contato");
		return query.getResultList();
	}

	@Override
	public void remover(Contato pContato) {
		Contato contato = em.merge(pContato);
		em.remove(contato);

	}

	@Override
	public Contato salvarOuAtualizar(Contato pContato) {
		Contato contato;
		if(pContato.getId() != null){
			contato = em.merge(pContato);
		}else{
			contato = pContato;
		}
		em.persist(contato);
		
		return contato;
	}

}
