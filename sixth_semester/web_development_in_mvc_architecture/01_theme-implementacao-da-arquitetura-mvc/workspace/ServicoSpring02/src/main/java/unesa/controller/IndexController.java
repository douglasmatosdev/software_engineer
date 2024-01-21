/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unesa.model.MensagemSimples;

/**
 *
 * @author denis
 */
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/")
public class IndexController {
    
    @GetMapping
    public MensagemSimples acessar(){
        return new MensagemSimples("Status","Conexão efetuada com sucesso");
    }
    
    @GetMapping("index")
    public MensagemSimples acessar2(){
        return acessar();
    }
    
}
