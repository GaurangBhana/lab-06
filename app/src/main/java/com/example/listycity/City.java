package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that represents a City.
 *  @author Gaurang Bhana
 *  @version 1.0
 */
public class City implements Comparable{
    private String city;
    private String province;

    /**
     * City constructor
     * @param city
     * @param province
     * @author Gaurang Bhana
     * @version 1.0
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * A getter for the city name
     * @return The string representing the name of the city
     * @author Gaurang Bhana
     * @version 1.0
     */
    String getCityName(){
        return this.city;
    }

    /**
     * A setter for the name of the city
     * @param city
     * @author Gaurang Bhana
     * @version 1.0
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * A setter for the name of the province
     * @param province
     * @author Gaurang Bhana
     * @version 1.0
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * A getter for the name of the province
     * @return The string representing the name of the province
     * @author Gaurang Bhana
     * @version 1.0
     */
    String getProvinceName(){
        return this.province;
    }

    
    /** This method compares cities based on city name field
     * @param o: the city for this city to be compared against
     * @return the compared values of their city strings
     * @author Gaurang Bhana
     * @version 1.0
     */
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /** Checks if two cities have equal values
     * @param city the city object to compare equality with
     * @return true if they have equal values, false otherwise
     * @author Gaurang Bhana
     * @version 1.0
     */
    @Override
    public boolean equals(Object city){
        if (!(city instanceof City)){
            return false;
        }
        City city_2 = (City) city;
        return (Objects.equals(this.city, city_2.getCityName())) && (Objects.equals(this.province, city_2.getProvinceName()));
    }
    
}
