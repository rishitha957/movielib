package com.coursera.assignment.movie.model;

import com.coursera.assignment.movie.model.enums.WatchStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "watch_list")
public class WatchList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @Column
    private LocalDateTime timeStamp;

    @Column(name = "watch_status")
    @Enumerated(EnumType.STRING)
    private WatchStatus watchStatus;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public WatchStatus getWatchStatus() {
        return watchStatus;
    }

    public void setWatchStatus(WatchStatus watchStatus) {
        this.watchStatus = watchStatus;
    }
}
