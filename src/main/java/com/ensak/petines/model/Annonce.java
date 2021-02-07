package com.ensak.petines.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "annonce")
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idAnnonce")
    private Integer idAnnonce;

    @Column(name="Titre")
    private String titreAnnonce;

    @Column(name="categorie")
    private String categorie;

    @Column(name="description")
    private String description;

    @Column(name="prix")
    private Long prix;

    @Column(name="age")
    private Integer age;

    @Column(name="fiche")
    private String fiche;

    @Column(name="telephone")
    private String telephone;

    @Column(name="petsimg")
    private String petsimg;

    public Annonce() {
    }

    public Annonce(String titreAnnonce, String categorie, String description, Long prix, Integer age, String fiche, String telephone, String petsimg) {
        this.titreAnnonce = titreAnnonce;
        this.categorie = categorie;
        this.description = description;
        this.prix = prix;
        this.age = age;
        this.fiche = fiche;
        this.telephone = telephone;
        this.petsimg = petsimg;
    }

    public String getTitreAnnonce() {
        return titreAnnonce;
    }

    public void setTitreAnnonce(String titreAnnonce) {
        this.titreAnnonce = titreAnnonce;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrix() {
        return prix;
    }

    public void setPrix(Long prix) {
        this.prix = prix;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFiche() {
        return fiche;
    }

    public void setFiche(String fiche) {
        this.fiche = fiche;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPetsimg() {
        return petsimg;
    }

    public void setPetsimg(String petsimg) {
        this.petsimg = petsimg;
    }
}
