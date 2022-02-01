package com.coursera.assignment.movie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "movie_cast",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    @Column
    private List<Actor> movieCast;

    @Column
    private double rating;

    @ManyToOne
    @JoinColumn(name = "movies_genre")
    private Genre movieGenre;


    public Movie(){
        //For Persistence
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Genre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(Genre movieGenre) {
        this.movieGenre = movieGenre;
    }

}
