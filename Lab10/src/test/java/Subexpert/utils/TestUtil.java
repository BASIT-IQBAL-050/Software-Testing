package Subexpert.utils;


import org.testng.Assert;

public class TestUtil {
    public static void verifyText(String actual, String expected) {
        Assert.assertEquals(actual, expected, "Text verification failed!");
    }
}
