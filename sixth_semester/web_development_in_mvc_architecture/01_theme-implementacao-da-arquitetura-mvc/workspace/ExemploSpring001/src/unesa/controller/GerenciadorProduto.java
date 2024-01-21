/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import unesa.dao.ProdutoDAO;
import unesa.model.Produto;

/**
 *
 * @author denis
 */


@Component
public class GerenciadorProduto {
    
    @Autowired
    private ProdutoDAO produtoDAO;
    
    @Transactional
    public void add(Produto produto){
        produtoDAO.persist(produto);
    }
    
    @Transactional(readOnly = true)
    public List<Produto> findAll(){
        return produtoDAO.findAll();                
    }
        
}
