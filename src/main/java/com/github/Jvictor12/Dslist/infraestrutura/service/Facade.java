package com.github.Jvictor12.Dslist.infraestrutura.service;

import com.github.Jvictor12.Dslist.entity.Game;
import com.github.Jvictor12.Dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Facade {

    @Autowired
    private GameService gameService;

    public List<Game> gameFindAll(){ return gameService.findAll(); };
}