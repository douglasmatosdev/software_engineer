/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import unesa.model.Produto;


public interface ProdutoDAO extends JpaRepository<Produto, String>{
    
}
