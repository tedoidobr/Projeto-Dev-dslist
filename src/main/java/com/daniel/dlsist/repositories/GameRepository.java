package com.daniel.dlsist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.dlsist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
