package com.ensak.petines.model;

import javax.persistence.*;

@Entity
@Table(name="commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name="pet_id")
    private Pets pet;

    @Column(name="status")
    private String status;

    @Column(name="date")
    private String date;

    @Column(name="location")
    private String location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pets getPet() {
        return pet;
    }

    public void setPet(Pets pet) {
        this.pet = pet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //TODO : lat long for places cible reservation
    // location => lat + long (2 columns)


    public Commande() {
    }

    public Commande(User user, Pets pet, String status, String date, String location) {
        this.user = user;
        this.pet = pet;
        this.status = status;
        this.date = date;
        this.location = location;
    }

}