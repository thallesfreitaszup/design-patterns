package org.example;

import org.example.creational.singleton.Singleton;
import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {


    @Test
    public void testSingletonInstance() {
        var instance = Singleton.getInstance();
        var instanceCompare = Singleton.getInstance();
        Assert.assertEquals(instance, instanceCompare);
    }
}
