package com.coursera.assignment.movie.repository;

import com.coursera.assignment.movie.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {
    @Query("SELECT name FROM Movie p where p.name LIKE %:movieName%")
    String findByName(String movieName);
}
