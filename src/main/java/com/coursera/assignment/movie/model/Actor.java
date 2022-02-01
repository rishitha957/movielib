package com.coursera.assignment.movie.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int age;
    @Column
    private String sex;
    @Column
    private Date dateOfBirth;
    @Column
    private double heightInInches;
    @ManyToMany(mappedBy = "movieCast")
    private List<Movie> moviesByActor;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(double heightInInches) {
        this.heightInInches = heightInInches;
    }
}
