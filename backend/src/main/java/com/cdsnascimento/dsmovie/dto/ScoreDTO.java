package com.cdsnascimento.dsmovie.dto;

public class ScoreDTO {
  private long movieId;
  private String email;
  private Double score;
  

  public ScoreDTO() {
  }

  public ScoreDTO(long movieId, String email, Double score) {
    this.movieId = movieId;
    this.email = email;
    this.score = score;
  }

  public long getMovieId() {
    return this.movieId;
  }

  public void setMovieId(long movieId) {
    this.movieId = movieId;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Double getScore() {
    return this.score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


}
