package com.devsuperior.dsMovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsMovie.entities.Score;
import com.devsuperior.dsMovie.entities.ScorePK;
import com.devsuperior.dsMovie.entities.User;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

	
}
