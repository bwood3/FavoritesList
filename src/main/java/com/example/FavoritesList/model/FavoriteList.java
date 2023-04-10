package com.example.FavoritesList.model;

import com.example.FavoritesList.sharedModel.*;

import java.util.List;
import java.util.Observable;

public class FavoriteList extends Observable {
    private List<Property> favoriteProperties;

    public void addProperty(Property property) {
        favoriteProperties.add(property);
        setChanged();
        notifyObservers();
    }

    public void removeProperty(Property property)
    {
        //code here
    }
    //getFavoriteProperties?
}
