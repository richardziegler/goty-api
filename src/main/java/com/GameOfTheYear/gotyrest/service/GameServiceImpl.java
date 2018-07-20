package com.GameOfTheYear.gotyrest.service;

import com.GameOfTheYear.gotyrest.domain.Game;
import com.GameOfTheYear.gotyrest.repositories.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game findGameById(Integer id) {
        return gameRepository.findById(id).get();
    }

    @Override
    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }
}
