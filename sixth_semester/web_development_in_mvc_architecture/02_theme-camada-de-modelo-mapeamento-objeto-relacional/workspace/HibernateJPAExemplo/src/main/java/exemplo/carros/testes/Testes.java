package exemplo.carros.testes;

import java.util.List;

import javax.persistence.EntityManager;

import exemplo.carros.dao.ModeloDao;
import exemplo.carros.modelo.Modelo;
import exemplo.carros.util.JPAUtil;

public class Testes {
	public static void main(String[] args) {
		cadastrarModelos();
		listarTodosModelos();
	}

	private static void cadastrarModelos() {
		EntityManager em = JPAUtil.getEntityManager();
		ModeloDao modeloDao = new ModeloDao(em);
		em.getTransaction().begin();
		modeloDao.cadastrar(new Modelo("Hatch"));
		modeloDao.cadastrar(new Modelo("Sedan"));
		em.getTransaction().commit();
		em.close();
		System.out.println("*** Cadastro com sucesso dos modelos de carros! ***");
	}

	private static void listarTodosModelos() {
		EntityManager em = JPAUtil.getEntityManager();
		ModeloDao modeloDao = new ModeloDao(em);
		List<Modelo> lstModelos = modeloDao.listarTodos();
		System.out.println("*** Resultado da consulta dos modelos de carros! ***");
		for (Modelo m : lstModelos) {
			System.out.println("id: " + m.getId() + "; nome:" + m.getNome());
		}
	}
}
