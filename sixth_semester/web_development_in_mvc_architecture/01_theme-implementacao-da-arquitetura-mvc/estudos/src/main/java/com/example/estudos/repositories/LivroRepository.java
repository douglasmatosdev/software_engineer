package com.example.estudos.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.estudos.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	Livro findById(long id);	
}
