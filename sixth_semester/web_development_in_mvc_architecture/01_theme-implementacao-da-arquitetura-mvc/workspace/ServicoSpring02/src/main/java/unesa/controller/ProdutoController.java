/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unesa.dao.ProdutoDAO;
import unesa.model.Produto;

/**
 *
 * @author denis
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/produtos")
public class ProdutoController {
    
    	@Autowired
	private ProdutoDAO dao;
	
	@GetMapping
	public List<Produto> obterTodos(){
		return dao.findAll();
	}
	
	@GetMapping("/{codigo}")
	public Produto obter(@PathVariable String codigo) {
		return dao.findById(codigo).get();
	}
	
	@PostMapping
	public Produto inserir(@RequestBody Produto produto) {
		return dao.save(produto);
	}
	
	@DeleteMapping("/{codigo}")
	public void deletar(@PathVariable String codigo) {
		dao.deleteById(codigo);
	}
	
	@PutMapping
	public void alterar(@RequestBody Produto produto) {
		dao.save(produto);
	}

    
}
