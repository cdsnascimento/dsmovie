package com.cdsnascimento.dsmovie.repositories;

import com.cdsnascimento.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
  
}
