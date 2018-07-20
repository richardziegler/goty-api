package com.GameOfTheYear.gotyrest.controllers;


import com.GameOfTheYear.gotyrest.domain.Game;
import com.GameOfTheYear.gotyrest.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(GameController.BASE_URL)
public class GameController {

    public static final String BASE_URL = "/api/v1/games";

    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    List<Game> getAllGames(){
        return gameService.findAllGames();
    }

    @GetMapping("/{id}")
    public Game getGameById(@PathVariable Integer id) {
        return gameService.findGameById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Game saveGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }
}
