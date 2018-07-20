package com.GameOfTheYear.gotyrest.service;

import com.GameOfTheYear.gotyrest.domain.Game;

import java.util.List;

public interface GameService {

    Game findGameById(Integer id);

    List<Game> findAllGames();

    Game saveGame(Game game);
}
