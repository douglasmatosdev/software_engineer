/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import unesa.dao.ProdutoDAO;
import unesa.model.Produto;

/**
 *
 * @author denis
 */
@Controller
@RequestMapping("/produtos")
@EnableTransactionManagement
public class ProdutoController {
    
    @Autowired
    ProdutoDAO dao;
    
    @RequestMapping(value = "/dadosProduto", method = RequestMethod.GET)
    public ModelAndView dadosProduto() {
        return new ModelAndView("dadosProduto", "command", new Produto());
    }
    
//    @RequestMapping(value = "/removeProduto/{codigo}", method = RequestMethod.GET)
//    public ModelAndView removeProduto(@PathVariable("codigo") String codigo) {
//        return new ModelAndView("removeProduto", "command", new Produto(codigo));
//    }


//    @RequestMapping(value = "/delProduto", method = RequestMethod.POST)
//    public String delProduto(
//           @ModelAttribute String codigo, ModelMap model) {
//        dao.remove(codigo);
//        model.addAttribute("produtos", dao.findAll());
//        return "listaProdutos";
//    }    
       
    @RequestMapping(value = "/addProduto", method = RequestMethod.POST)
    public String adicionarProduto(
           @ModelAttribute Produto dadosProduto, ModelMap model) {
        dao.persist(dadosProduto);
        model.addAttribute("produtos", dao.findAll());
        return "listaProdutos";
    }

    @RequestMapping(value = "/removeProduto", method = RequestMethod.GET)
    public String delProduto(
           @RequestParam(name="codigo") String codigoProduto, ModelMap model) {
        dao.remove(codigoProduto);
        model.addAttribute("produtos", dao.findAll());
        return "listaProdutos";
    }
    
    @RequestMapping(value = "/listaProdutos", method = RequestMethod.GET)
    public String listaProdutos( ModelMap model ) {
        model.addAttribute("produtos", dao.findAll());
        return "listaProdutos";
    }

}
