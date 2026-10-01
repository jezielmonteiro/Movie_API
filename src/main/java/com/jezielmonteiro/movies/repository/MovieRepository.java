package com.jezielmonteiro.movies.repository;

import com.jezielmonteiro.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}