/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author denis
 */
@Entity
@Table(name = "PRODUTO")
public class Produto implements Serializable {
    @Id
    private String codigo;
    private String nome;
    private Integer quantidade;

    public Produto() {
    }

    public Produto(String codigo) {
        this.codigo = codigo;
    }

    public Produto(String codigo, String nome, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }

    @Override
    public boolean equals(Object object) {
        return object != null && 
               object instanceof Produto &&
               this.codigo.equals(((Produto)object).getCodigo());
    }
    
}
