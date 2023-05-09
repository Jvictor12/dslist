package com.github.Jvictor12.Dslist.service;

import com.github.Jvictor12.Dslist.entity.Game;
import com.github.Jvictor12.Dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;


    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
