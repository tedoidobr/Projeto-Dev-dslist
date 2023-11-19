package com.daniel.dlsist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.dlsist.dto.GameMinDTO;
import com.daniel.dlsist.entities.Game;
import com.daniel.dlsist.repositories.GameRepository;

@Service
public class GameService {

	
	@Autowired
	private GameRepository gameRepository;
	public List<GameMinDTO> findAll() {
		List<Game> result= gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		
		
	}
	
}
