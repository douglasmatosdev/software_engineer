/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplospring001;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import unesa.controller.GerenciadorProduto;
import unesa.model.Produto;

/**
 *
 * @author denis
 */
public class ExemploSpring001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		//Create Spring application context
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring.xml");
		
		//Get service from context. (service's dependency (ProductDAO) is autowired in ProductService)
		GerenciadorProduto gerenciador = ctx.getBean(GerenciadorProduto.class);
		
		//Do some data operation
		
		gerenciador.add(new Produto("A001","Caneta", 100));
                gerenciador.add(new Produto("A002","Lapis", 230));
		
                for(Produto p: gerenciador.findAll())
                    System.out.println(p.getNome());
		
		ctx.close();
		
    }
    
}
