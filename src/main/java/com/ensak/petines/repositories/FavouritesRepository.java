package com.ensak.petines.repositories;

import com.ensak.petines.model.Favourite;
import com.ensak.petines.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface FavouritesRepository extends CrudRepository<Favourite, Integer> {

    //@Query("Select o From Order o Where o.user.username= :#{#user.username} AND o.status = 'cart'")
    //List<Pets> getOrderItemsOfOrderByUserAndByStatus(@Param("user") User user);

    @Query("Select o From Favourite o Where o.user.username= :#{#user.username}")
    Optional<List<Favourite>> findFavouritesByUser(@Param("user") User user);

    Optional<Favourite> findFavouriteByFid(Integer fav_id);

    //@Query("Select p, o from Pets p left outer join Favourite o on p.id = o.pets.id where o.user.id= :#{#user.id}")
    //Optional<List<Object>> getAllPetsForConnectedUser(User user);

    //@Query("Select p.id, p.name, p.species, p.breed, p.gender, p.birth, p.picture, p.description, p.user.id as uid, p.lat, p.lon, o.user.id as u_id , o.liked from Pets p left outer join Favourite o on p.id = o.pets.id where o.user.id= :#{#user.id}")

}
