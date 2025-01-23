package com.annyprojetos.dslist.services;

import com.annyprojetos.dslist.dto.GameDTO;
import com.annyprojetos.dslist.dto.GameMinDTO;
import com.annyprojetos.dslist.entities.Game;
import com.annyprojetos.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {
//1
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() { //2
       List<Game> result =  gameRepository.findAll(); //3
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList()); //4
       return dto;
    }

    @Transactional(readOnly = true) //6
    public GameDTO findById(Long id){ //5
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }


}
