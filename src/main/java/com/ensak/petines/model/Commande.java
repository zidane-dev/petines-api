package com.ensak.petines.model;

import javax.persistence.*;

@Entity
@Table(name="commande")
public class Commande {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Integer id;
/*
    @ManyToOne
    @JoinColumn(name = "user_id")
        private User user;

    @OneToOne
    @JoinColumn(name="pet_id")
        private Pets pet;

 */

        @Column(name= "user_id")
        private Integer user_id ;

        @Column(name= "pet_id")
        private Integer pet_id;

        @Column(name="status")
        private String status;

        @Column(name="date")
        private String date;

        @Column(name="location")
        private String location;

    //TODO : lat long for places cible reservation
    // location => lat + long (2 columns)


    public Commande() {
    }

    public Commande(Integer user, Integer pet, String status, String date, String location) {
        this.user_id = user;
        this.pet_id = pet;
        this.status = status;
        this.date = date;
        this.location = location;
    }
}
