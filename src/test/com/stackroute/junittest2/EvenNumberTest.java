package com.stackroute.junittest2;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumberTest {
    EvenNumber evenNumber=new EvenNumber();

    @Before
    public void setUp() {
        System.out.println("Before");


    }

    @After
    public void tearDown() {
        System.out.println("After");
        evenNumber = null;

    }

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("BeforeClass");


    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("AfterClass");


    }

    @Test
    public void givenNumbershouldReturnTrue() {

        //arrange
        EvenNumber evenNumber=new EvenNumber();

        //Act
        boolean result = evenNumber.isEven(64);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnTrueforNegativeNumber() {

        //arrange
        EvenNumber evenNumber=new EvenNumber();

        //Act
        boolean result = evenNumber.isEven(-70);
        //Assert
        assertEquals(true, result);
    }
    @Test
    public void givenNumbershouldReturnFalseForOdd() {

        //arrange
        EvenNumber evenNumber=new EvenNumber();

        //Act
        boolean result = evenNumber.isEven(11);
        //Assert
        assertEquals(false, result);
    }

}
