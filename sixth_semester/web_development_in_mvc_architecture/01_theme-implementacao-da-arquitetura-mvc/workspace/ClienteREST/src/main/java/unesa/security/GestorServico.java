/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.security;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import unesa.retrofit.ProdutoService;

/**
 *
 * @author denis
 */
public class GestorServico {
    
    private final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private final Retrofit retrofit;

    public GestorServico(String user, String password) {
        String token = Credentials.basic(user, password);
        InterceptadorLogin interceptador = new InterceptadorLogin(token);
        httpClient.addInterceptor(interceptador);
        retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8080")
                .client(httpClient.build())
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }
    
    public ProdutoService createService(){
        return retrofit.create(ProdutoService.class);
    }
    
}
