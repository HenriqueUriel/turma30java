package com.MinhaLojaDeGames.LojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MinhaLojaDeGames.LojaDeGames.Model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo);

}
