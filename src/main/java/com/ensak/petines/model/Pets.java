package com.ensak.petines.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="petty")
public class Pets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="name")
    private String name;
    @Column(name="species")
    private String species;
    @Column(name="breed")
    private String breed;
    @Column(name="gender")
    private int gender;
    @Column(name="birth")
    private String birth;
    @Column(name="picture")
    private String picture;
    @Column(name="love")
    private String love;
    @Column(name="description")
    private String description;

    @Column(name="lat")
    private String lat;
    @Column(name="lon")
    private String lon;

    @ManyToOne
    @JoinColumn(name="uid")
    private User user;

    @JsonIgnore
    @OneToMany(mappedBy="pets")
    private Set<Favourite> favourites;

    //    @ManyToMany(mappedBy = "pets")
//    private Set<Favourite> favourites;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Pets() {
    }
/*
    public Boolean getLove() {
        return love;
    }
    public void setLove(Boolean love) {
        this.love = love;
    }
 */

    public String getLove() {
        return love;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Favourite> getFavourites() {
        return favourites;
    }

    public void setFavourites(Set<Favourite> favourites) {
        this.favourites = favourites;
    }
}
