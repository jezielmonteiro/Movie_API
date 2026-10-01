package com.jezielmonteiro.movies.controller;

import com.jezielmonteiro.movies.model.Movie;
import com.jezielmonteiro.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public List getAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> findById(@PathVariable Long id) {
        return movieRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        movieRepository.deleteById(id);
    }

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
}