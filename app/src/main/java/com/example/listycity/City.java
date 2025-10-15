package com.example.listycity;

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
    
}
