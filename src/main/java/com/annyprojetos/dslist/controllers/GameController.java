package com.annyprojetos.dslist.controllers;

import com.annyprojetos.dslist.dto.GameDTO;
import com.annyprojetos.dslist.dto.GameMinDTO;
import com.annyprojetos.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games") //1
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() { //2
        List<GameMinDTO> result = gameService.findAll(); //3
        return result;
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id) {
       GameDTO result = gameService.findById(id);
       return result;
    }


}
