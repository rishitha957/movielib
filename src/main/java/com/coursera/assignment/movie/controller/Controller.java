package com.coursera.assignment.movie.controller;

import com.coursera.assignment.movie.model.Movie;
import com.coursera.assignment.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class Controller {

    @Autowired
    private MovieRepository movieRepository;

    @PostMapping("movie")
    public String addMovie(@RequestParam String name){
        movieRepository.save(new Movie(name));
        return movieRepository.findByName(name)+"Saved successfully";
    }

    @GetMapping("movie")
    public List<Movie> getAllMovies(){
        return (List<Movie>) movieRepository.findAll();
    }
}
