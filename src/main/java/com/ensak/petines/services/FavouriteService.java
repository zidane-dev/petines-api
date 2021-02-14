package com.ensak.petines.services;

import com.ensak.petines.model.Favourite;
import com.ensak.petines.model.Pets;
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
        //favouritesRepository.save(fav1);
        if(Boolean.FALSE.equals(love)){
            favouritesRepository.delete(fav1);
        }
        return fav1;
    }

    public Favourite addFavourité(User u, Pets p) {
        Favourite f1 = new Favourite();
        f1.setFid(99);
        f1.setPets(p);
        f1.setUser(u);
        f1.setLiked(Boolean.TRUE);
        favouritesRepository.save(f1);
        return f1;
    }
/*
    public Favourite updateLoveByFav(Integer fav_id, Favourite fav) {
        Favourite f = favouritesRepository.findFavouriteByFid(fav_id).orElse(null);

        Favourite fav1;
        if (Boolean.FALSE.equals(love)) {
            fav1 = favouritesRepository.findFavouriteByFid(fav_id).orElse(null);
            fav1.setLiked(love);
            favouritesRepository.delete(fav1);
            //favouritesRepository.save(fav1);
            return fav1;
        }
        else if(love) {
            fav1 = favouritesRepository.findFavouriteByFid(fav_id).orElse(null);
            fav1.setLiked(love);
            favouritesRepository.save(fav1);
            return fav1;
        }
    }

 */
}
