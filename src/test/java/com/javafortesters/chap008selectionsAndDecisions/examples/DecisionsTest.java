package com.javafortesters.chap008selectionsAndDecisions.examples;

import org.junit.Assert;
import org.junit.Test;

public class DecisionsTest {

    int numberOfCats = 1;

    Boolean truthy = true;
    Boolean falsey = false;

    public String catOrCats(int numOfCats) {
        String catString = numOfCats == 1 ? "cat" : "cats";
        return catString;
    }

    @Test
    public void getCatString() {
        Assert.assertEquals("cat", catOrCats(numberOfCats));
    }

    @Test
    public void truthyIsTrue() {
        if (truthy) Assert.assertTrue(truthy);
    }

    @Test
    public void truthyIsTrue2() {
        if (truthy) Assert.assertTrue(truthy);
        Assert.assertFalse(!truthy);
    }

    @Test
    public void truthyIsTrue3() {
        if (truthy) Assert.assertTrue(truthy);
        else Assert.assertFalse(truthy);
    }

    @Test
    public void truthyIsTrue4() {
        if (truthy) {
            Assert.assertTrue(truthy);
            Assert.assertFalse(!truthy);
        }
        else {
            Assert.assertFalse(truthy);
        }
    }

    @Test
    public void truthyFalsey() {
        if (truthy) {
            if (!falsey) {
                if (truthy && !falsey) {
                    if (falsey || truthy) {
                        Assert.assertTrue(truthy == true);
                        Assert.assertTrue(falsey == false);
                    }
                }
            }
            else {
                Assert.assertTrue(truthy == true);
                Assert.assertTrue(falsey == true);
            }
        }
        else {
            if (!truthy) {
                if (falsey) {
                    Assert.assertTrue(falsey == true);
                    Assert.assertTrue(truthy == false);
                }
                else {
                    Assert.assertTrue(falsey == false);
                    Assert.assertTrue(truthy == false);
                }
            }
        }
    }

    @Test
    public void switchCountry(){
        Assert.assertEquals("United Kingdom", likelyCountryIs("UK"));
        Assert.assertEquals("United States", likelyCountryIs("US"));
        Assert.assertEquals("United States", likelyCountryIs("USA"));
        Assert.assertEquals("France", likelyCountryIs("FR"));
        Assert.assertEquals("Sweden", likelyCountryIs("SE"));
        Assert.assertEquals("Rest Of World", likelyCountryIs("PH"));
    }

    public String likelyCountryIs(String country){
        String likelyCountry;

        switch(country.toLowerCase()){
            case "uk":
                likelyCountry = "United Kingdom";
                break;
            case "us":
                likelyCountry = "United States";
                break;
            case "usa":
                likelyCountry = "United States";
                break;
            case "fr":
                likelyCountry = "France";
                break;
            case "se":
                likelyCountry = "Sweden";
                break;
            default:
                likelyCountry = "Rest Of World";
                break;
        }
        return likelyCountry;
    }

    @Test
    public void switchNumber(){
        Assert.assertEquals("One", likelyNumberIs(1));
        Assert.assertEquals("Two", likelyNumberIs(2));
        Assert.assertEquals("Three", likelyNumberIs(3));
        Assert.assertEquals("Four", likelyNumberIs(4));
        Assert.assertEquals("Too big", likelyNumberIs(5));
        Assert.assertEquals("Too small", likelyNumberIs(0));
    }

    public String likelyNumberIs(int number){
        String likelyNumber = null;

        switch(number){
            case 1:
                likelyNumber = "One";
                break;
            case 2:
                likelyNumber = "Two";
                break;
            case 3:
                likelyNumber = "Three";
                break;
            case 4:
                likelyNumber = "Four";
                break;
            default:
                if (number > 4) {
                    likelyNumber = "Too big";
                }
                if (number < 1) {
                    likelyNumber = "Too small";
                }
                break;
        }
        return likelyNumber;
    }

}
