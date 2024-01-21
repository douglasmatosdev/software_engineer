/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.clienterest;

import unesa.security.GestorServico;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import unesa.data.Produto;
import unesa.retrofit.ProdutoService;

/**
 *
 * @author denis
 */
public class ClienteREST {

    public static void main(String[] args) throws Exception {

//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://localhost:8080")
//                .addConverterFactory(JacksonConverterFactory.create())
//                .build();
//
//        ProdutoService service = retrofit.create(ProdutoService.class);

        // Processando de forma síncrona
        ProdutoService service = new GestorServico("usu1", "1234").createService();
        Produto p1 = new Produto();
        p1.codigo = "B002A";
        p1.nome   = "MANGA";
        p1.quantidade = 500;
        service.inserir(p1).execute();
        p1.quantidade = 800;
        service.alterar(p1).execute();
        for (Produto p : service.obterTodos().execute().body()) {
            System.out.println(p.nome+" ("+p.codigo+"): "+p.quantidade);
        }
        service.deletar("B002A").execute();

    }
}
