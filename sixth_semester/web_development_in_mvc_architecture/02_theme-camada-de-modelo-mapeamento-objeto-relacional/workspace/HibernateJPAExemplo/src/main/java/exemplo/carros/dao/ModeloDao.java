package exemplo.carros.dao;

import java.util.List;

import javax.persistence.EntityManager;

import exemplo.carros.modelo.Modelo;

public class ModeloDao {
	private EntityManager em;

	public ModeloDao(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Modelo modelo) {
		this.em.persist(modelo);
	}

	public void atualizar(Modelo modelo) {
		this.em.merge(modelo);
	}

	public void remover(Modelo modelo) {
		modelo = em.merge(modelo);
		this.em.remove(modelo);
	}

	public List<Modelo> listarTodos() {
		String jpql = "SELECT m FROM Modelo m";
		return em.createQuery(jpql, Modelo.class).getResultList();
	}
}