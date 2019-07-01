package com.stackroute.junitdemo;

import com.stackroute.junittest2.Power;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {

    Power obj = new Power();

    @Before
    public void setUp()
    {
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        obj=null;
    }
    @Test
    public void givenStringShouldReturnFalse()
    {
        Power obj=new Power();
        //Act
        boolean result=obj.powerOfFour(14);
        assertEquals("false",result);
    }
    @Test
    public void givenStringShouldReturnTrue()
    {
        Power obj=new  Power();
        //Act
        boolean result=obj.powerOfFour(64);
        assertEquals("true",result);
    }
    @Test
    public void givenStringShouldReturnFalseForZero()
    {
        Power obj=new  Power();
        //Act
        boolean result=obj.powerOfFour(0);
        assertEquals("false",result);
    }


}