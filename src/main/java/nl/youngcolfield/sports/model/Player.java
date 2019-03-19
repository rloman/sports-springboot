package nl.youngcolfield.sports.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;

    @ManyToOne
    private Team team;

    @OneToOne
    @JsonIgnoreProperties("player")
    private Bike bike;



}
