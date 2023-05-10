package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	//interface extendida do JPA para fazer iteração com banco de dados
	//passado o tipo (GameList) e o tipo da variavel do Id(nesse caso long)
}
