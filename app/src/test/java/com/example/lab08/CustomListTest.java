package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    void testDelete() {
        CustomList list = new CustomList();
        City city = new City("Calgary", "AB");
        list.addCity(city);
        list.delete(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());
        list.addCity(new City("Lahore", "Punjab"));
        assertEquals(2, list.countCities());
    }

}