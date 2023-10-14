package com.example.estudos.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.estudos.entities.Livro;
import com.example.estudos.repositories.LivroRepository;
import com.example.estudos.services.LivroService;

@Service
public class LivroServiceImpl implements LivroService {
	private LivroRepository livroRepository;
	
	public LivroServiceImpl(LivroRepository livroRepository) {
		super();
		this.livroRepository = livroRepository;
	}
	
	public List<Livro> listaLivros(){
  		return livroRepository.findAll();
  	}
	
	public Livro listaLivroUnico(long id){
  		return livroRepository.findById(id);
  	}
	
	public Livro salvaLivro(Livro livro) {
  		return livroRepository.save(livro);
  	}
	
	public Livro atualizarLivro(Long id, Livro livroAtualizado) {
		Livro livro = this.listaLivroUnico(id);
		livro.setTitulo(livroAtualizado.getTitulo());
  		return livroRepository.save(livro);
  	}
	
	public void excluirLivro(Long id) {
  		livroRepository.deleteById(id);
  	}
}
