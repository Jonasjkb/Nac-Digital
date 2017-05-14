package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente, Integer> implements ClienteDAO {

	public ClienteDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public List<Cliente> listar() {
	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		return em.createQuery("from Cliente ",Cliente.class).getResultList();
	}

}
