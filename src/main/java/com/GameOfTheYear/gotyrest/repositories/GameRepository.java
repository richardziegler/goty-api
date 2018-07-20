package com.GameOfTheYear.gotyrest.repositories;

import com.GameOfTheYear.gotyrest.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer> {
}
