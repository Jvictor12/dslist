package com.github.Jvictor12.Dslist.controller;

import com.github.Jvictor12.Dslist.infraestrutura.service.Facade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/game")
public class GameController {

    @Autowired
    public Facade facade;

    @GetMapping
    public ResponseEntity findAll(){ return ResponseEntity.status(HttpStatus.OK).body(facade.gameFindAll());
    }
}
