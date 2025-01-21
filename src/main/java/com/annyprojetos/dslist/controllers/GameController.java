package com.annyprojetos.dslist.controllers;

import com.annyprojetos.dslist.dto.GameDTO;
import com.annyprojetos.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games") //1
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameDTO> findAll() { //2
        List<GameDTO> result = gameService.findAll(); //3
        return result;
    }


}
