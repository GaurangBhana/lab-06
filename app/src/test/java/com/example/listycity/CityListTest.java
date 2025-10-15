package com.example.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    public void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    public void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    public void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    public void testDelete() {
        CityList cityList = mockCityList();

        City city = new City("Calgary", "Alberta");

        cityList.add(city);
        assertEquals(2, cityList.getCities().size());

        City city1 = new City("Fort Chipewyan","Alberta");

        cityList.delete(new City("Calgary", "Alberta"));
        assertEquals(1, cityList.getCities().size());

        assertThrows(IllegalArgumentException.class, () -> {cityList.delete(city1);});
    }

    @Test
    public void testMembershipOps(){
        CityList cityList = mockCityList();

        City city = new City("Calgary", "Alberta");

        cityList.add(city);
        assertTrue(cityList.hasCity(new City("Calgary", "Alberta")));

        assertFalse(cityList.hasCity(new City("Wabamun", "Alberta")));
    }

    @Test
    public void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Winnipeg", "Manitoba"));
        assertEquals(2, cityList.countCities());

        cityList.delete(new City("Edmonton", "Alberta"));
        assertEquals(1, cityList.countCities());

        cityList.add(new City("Viridian City", "Kanto"));
        cityList.add(new City("Goldenrod City", "Johto"));
        cityList.add(new City("Littleroot Town", "Hoenn"));
        cityList.add(new City("Jubilife City", "Sinnoh"));
        cityList.add(new City("Nimbasa City", "Unova"));

        assertEquals(6, cityList.countCities());
    }
}
