/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unesa.meutesteoauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author denis
 */
@SpringBootApplication
@ComponentScan(basePackages = "unesa")
public class MeuTesteOAuthApp {
	public static void main(String[] args) {
		SpringApplication.run(MeuTesteOAuthApp.class, args);
	}
}
