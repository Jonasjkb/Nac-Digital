package br.com.fiap.bo;

import java.util.List;

import javax.persistence.EntityManager;

import org.apache.axis2.AxisFault;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.Cliente;
import br.com.fiap.exception.CommitErrorException;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class ClienteBO {

	public void cadastrar(Cliente cliente) throws AxisFault {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		try {
			dao.cadastrar(cliente);
			dao.commit();
		} catch (CommitErrorException e) {
			e.printStackTrace();
			throw new AxisFault("Falha ao cadastrar!");
		} finally {
			em.close();
		}
	}
	
	public Cliente buscar(int codigo) {
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		
		Cliente cliente = dao.buscar(codigo);
		
		em.close();
		return cliente;
	}
	
	public List<Cliente> listar(){
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		ClienteDAO dao = new ClienteDAOImpl(em);
		List<Cliente> lista = dao.listar();
		
		em.close();
		return lista;
	}
	
	
	
}
