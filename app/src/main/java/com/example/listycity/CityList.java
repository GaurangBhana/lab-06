package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class holds our City type objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist, and throws an exception if the city
     * already exists in the list
     * @param city: This is a candidate city to add
     * @throws IllegalArgumentException : if the city that is added is already a city in the list
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean hasCity(City city){
        return cities.contains(city);
    }

    public void delete(City city){
        if (this.hasCity(city)){
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int countCities(){
        return cities.size();
    }

}
