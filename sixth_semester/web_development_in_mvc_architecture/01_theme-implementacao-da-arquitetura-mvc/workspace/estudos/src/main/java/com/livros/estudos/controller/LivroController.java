package com.livros.estudos.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.livros.estudos.entity.Livro;
import com.livros.estudos.service.LivroService;

@RestController
public class LivroController {
	@Autowired
	LivroService livroService;

	public LivroController(LivroService livroService) {
		super();
		this.livroService = livroService;
	}

	@GetMapping("/livros")
	public List<Livro> listaLivros() {
		return livroService.listaLivros();
	}

	@GetMapping("/livro/{id}")
	public Livro listaLivroUnico(@PathVariable(value = "id") long id) {
		return livroService.listaLivroUnico(id);
	}

	@PostMapping("/livro")

	public Livro salvaLivro(@RequestBody @Validated Livro livro) {
		return livroService.salvaLivro(livro);
	}

	@PutMapping("/livro/{id}")
	public Livro atualizarLivro(@PathVariable(value = "id") Long id, @RequestBody @Validated Livro livro) {
		return livroService.atualizarLivro(id, livro);
	}

	@DeleteMapping("livro/{id}")

	public void excluirLivro(@PathVariable(value = "id") Long id) {
		livroService.excluirLivro(id);
	}
}