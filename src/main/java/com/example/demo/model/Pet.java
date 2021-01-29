package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="pet_id")
    private Integer pid;
    @Column(name="pet_name")
    private String petName;
    @Column(name="quantity")
    private int quantity;
    @Column(name="price")
    private String price;
    @Column(name="pet_stock")
    private String petStock;
    @Column(name="pet_image")
    private String petImage;
    @Column(name="status")
    private String status;
    @Column(name="pet_desc")
    private String pet_desc;

    //@OneToMany(mappedBy = "pOrderItems")
    //JoinColumn(name = "orderitem_id")
    //private Set<OrderItem> pOrderItems;

//    @ManyToMany(mappedBy = "pets")
//    private Set<Favourite> favourites;

    @JsonIgnore
    @OneToMany(mappedBy="pet_id")
    private Set<Review> reviews;


    @Column(name="pet_hsimage")
    private String pet_hsimage;

    public Pet() {
    }


    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPet_desc() {
        return pet_desc;
    }

    public void setPet_desc(String pet_desc) {
        this.pet_desc = pet_desc;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPet_hsimage() {
        return pet_hsimage;
    }

    public void setPet_hsimage(String pet_hsimage) {
        this.pet_hsimage = pet_hsimage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPetStock() {
        return petStock;
    }

    public void setPetStock(String petStock) {
        this.petStock = petStock;
    }

    public String getPetImage() {
        return petImage;
    }

    public void setPetImage(String petImage) {
        this.petImage = petImage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
