package com.ensak.petines.services;

import com.ensak.petines.model.Favourite;
import com.ensak.petines.model.User;
import com.ensak.petines.repositories.FavouritesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class FavouriteService {

    @Autowired
    FavouritesRepository favouritesRepository;

    public List<Favourite> findFavouritesByUser(User user) {
        return favouritesRepository.findFavouritesByUser(user).orElse(null);
    }

    public Favourite updateLove(Integer fav_id, boolean love) {
        Favourite fav1 = favouritesRepository.findFavouriteByFid(fav_id).orElse(null);
        fav1.setLiked(love);
        favouritesRepository.save(fav1);
        return fav1;
    }
}
