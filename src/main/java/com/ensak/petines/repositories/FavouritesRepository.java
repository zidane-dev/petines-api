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
}
