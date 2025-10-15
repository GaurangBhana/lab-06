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

    /** Checks if the city list contains the inputted city
     * @param city: city to check membership of in the CityList object
     * @return : true if the city is in the list, false otherwise
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /** Deletes the inputted city from the list if it exists, otherwise we throw an
     * IllegalArgumentException
     * @param city: the city to be removed
     * @exception IllegalArgumentException : occurs if the city to be removed is not in the list
     */
    public void delete(City city){
        if (this.hasCity(city)){
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /** Returns the number of elements in the CityList object
     * @return : the amount of elements in the CityList object
     */
    public int countCities(){
        return cities.size();
    }

}
