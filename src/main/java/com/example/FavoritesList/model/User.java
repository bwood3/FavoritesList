package com.example.FavoritesList.model;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private FavoriteList favoriteList;

    @Override
    public void update(Observable o, Object arg) {
        //handle updates to the favorite list
    }
}
