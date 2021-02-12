package com.ensak.petines.model;

import javax.persistence.*;
@Entity
@Table(name="favourites")
public class Favourite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="fid")
    private Integer fid;

    @ManyToOne
    @JoinColumn(name="u_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name="p_id")

    private Pets pets;

    @Column(name="liked")
    private Boolean liked;

    public Favourite() {
    }

    public Favourite(User user, Pets pets, Boolean liked) {
        this.user = user;
        this.pets = pets;
        this.liked = liked;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Pets getPets() {
        return pets;
    }

    public void setPets(Pets pets) {
        this.pets = pets;
    }

    public Boolean getLiked() {
        return liked;
    }

    public void setLiked(Boolean liked) {
        this.liked = liked;
    }
}
