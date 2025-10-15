package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable{
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    String getProvinceName(){
        return this.province;
    }

    
    /** This method compares cities based on city name field
     * @param o: the city for this city to be compared against
     * @return : the compared values of their city strings
     */
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }

    /** Checks if two cities have equal values
     * @param city : the city object to compare equality with
     * @return : true if they have equal values, false otherwise
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
