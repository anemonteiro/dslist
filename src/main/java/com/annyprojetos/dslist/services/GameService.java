package com.annyprojetos.dslist.services;

import com.annyprojetos.dslist.dto.GameDTO;
import com.annyprojetos.dslist.entities.Game;
import com.annyprojetos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
//1
    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() { //2
       List<Game> result =  gameRepository.findAll(); //3
       List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).collect(Collectors.toList()); //4
       return dto;
    }
}
