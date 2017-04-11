package br.com.listatelefonica.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.listatelefonica.domain.Operadora;
import br.com.listatelefonica.model.dao.OperadoraDao;

public class OperadoraDaoImpl implements OperadoraDao {

	@PersistenceContext(unitName = "ListaTelefonicaPU")
	private EntityManager em;
	
	@Override
	public Operadora findById(Integer id) {
		return em.find(Operadora.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Operadora> listar() {
		Query query = em.createQuery("from Operadora");
		return query.getResultList();
	}

	@Override
	public void remover(Operadora pOperadora) {
		Operadora operadora = em.merge(pOperadora);
		em.remove(operadora);

	}

	@Override
	public Operadora salvarOuAtualizar(Operadora pOperadora) {
		Operadora operadora;
		if(pOperadora.getId() != null){
			operadora = em.merge(pOperadora);
		}else{
			operadora = pOperadora;
		}
		em.persist(operadora);
		
		return operadora;
	}

}
