/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import unesa.model.Produto;

/**
 *
 * @author denis
 */
@Component
public class ProdutoDAO {
	@PersistenceContext
	private EntityManager em;

	public void persist(Produto produto) {
		em.persist(produto);
	}

	public List<Produto> findAll() {
		return em.createQuery("SELECT p FROM Produto p").getResultList();
	}
}

