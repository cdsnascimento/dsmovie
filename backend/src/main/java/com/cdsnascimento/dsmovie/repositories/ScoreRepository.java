package com.cdsnascimento.dsmovie.repositories;

import com.cdsnascimento.dsmovie.entities.Score;
import com.cdsnascimento.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
  
}
