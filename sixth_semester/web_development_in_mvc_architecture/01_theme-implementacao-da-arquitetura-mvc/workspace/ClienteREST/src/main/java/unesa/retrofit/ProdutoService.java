/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.retrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import unesa.data.Produto;

/**
 *
 * @author denis
 */
public interface ProdutoService {
	@GET("produtos")
	Call<List<Produto>> obterTodos();

        @GET("produtos/{codigo}")
	Call<Produto> obter(@Path("codigo") String codigo);
	
	@POST("produtos")
	Call<Produto> inserir(@Body Produto produto);
	
	@DELETE("produtos/{codigo}")
	Call<Void> deletar(@Path("codigo") String codigo);
	
	@PUT("produtos")
	Call<Void> alterar(@Body Produto produto);
}
