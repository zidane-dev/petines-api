package com.ensak.petines.repositories;
import com.ensak.petines.model.Pets;
import com.ensak.petines.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PettyRepository extends CrudRepository<Pets, Integer> {

    List<Pets> findAll();

    Optional<Pets> findById(int id);

    List<Pets> findByUser(User u);

    @Query("Select p.id, p.name, p.species, p.breed, p.gender, p.birth, p.picture, p.description, p.user.id as uid, p.lat, p.lon, o.user.id as u_id , o.liked from Pets p left outer join Favourite o on p.id = o.pets.id where o.user.id= :#{#user.id}")
    Optional<List<Object>> getAllPetsForConnectedUser(User user);

    //@Query("Select p, o.user.id as u_id ,o.liked from Pets p left outer join Favourite o on p.id = o.pets.id where o.user.id= :#{#user.id}")
    // @Query("Select p.id, p.name, p.species, p.breed, p.gender, p.birth, p.picture, p.description, p.user.id as uid, p.lat, p.lon, o.user.id as u_id , o.liked from Pets p left outer join Favourite o on p.id = o.pets.id where o.user.id= :#{#user.id}")

}
