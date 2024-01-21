package com.livros.estudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.livros.estudos.entity.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	Livro findById(long id);
}