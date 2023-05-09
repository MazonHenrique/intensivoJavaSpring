package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	//interface extendida do JPA para fazer iteração com banco de dados
	//passado o tipo (Game) e o tipo da variavel do Id(nesse caso long)
}
