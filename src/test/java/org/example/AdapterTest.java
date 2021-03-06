package org.example;

import org.example.creational.builder.House;
import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {


    @Test
    public void testBuilder() {
        var house = new House.HouseBuilder().setRestroom(1).setKitchen(true).setRooms(4).setPainted(true).build();
        Assert.assertEquals(1, house.getRestroom());
        Assert.assertEquals(4, house.getRooms());
        Assert.assertTrue( house.isPainted());
        Assert.assertTrue( house.isKitchen());
    }
}
