package com.cdsnascimento.dsmovie.controllers;

import com.cdsnascimento.dsmovie.dto.MovieDTO;
import com.cdsnascimento.dsmovie.dto.ScoreDTO;
import com.cdsnascimento.dsmovie.services.ScoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

  @Autowired
  private ScoreService service;

  @PutMapping
  public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
    MovieDTO movieDTO = service.saveScore(dto);
    return movieDTO;
  }

}
