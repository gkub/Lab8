package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * create a mock list for citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void hasCityTest(){
        list = MockCityList();
        City realCity = new City("Medicine Hat", "AB");
        City fakeCity = new City("Fake City", "FL");
        list.addCity(realCity);
        assertTrue(list.hasCity(realCity));
        assertFalse(list.hasCity(fakeCity));
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
    }
}
