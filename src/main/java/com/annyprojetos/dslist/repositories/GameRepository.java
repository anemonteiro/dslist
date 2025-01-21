package com.annyprojetos.dslist.repositories;

import com.annyprojetos.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
