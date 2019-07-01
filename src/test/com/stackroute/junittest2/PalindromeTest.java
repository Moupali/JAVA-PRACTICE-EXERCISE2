package com.stackroute.junitdemo;

import com.stackroute.junittest2.Palindrome;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    Palindrome obj = new Palindrome();

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
 public void givenStringShouldReturnPallindrom()
        {
            Palindrome obj=new Palindrome();
        //Act
        String result=obj.find_Pallindrome("Madam",5);
        assertEquals("String is Pallindrome",result);
        }
 @Test
 public void givenStringShouldReturnPallindrome1()
        {
            Palindrome obj=new  Palindrome();
        //Act
        String result=obj.find_Pallindrome(" ",0);
        assertEquals("String is Pallindrome",result);
        }
    @Test
    public void givenStringShouldReturnStringIsNotPallindrome()
    {
        Palindrome obj=new  Palindrome();
        //Act
        String result=obj.find_Pallindrome("Mangotree",9);
        assertEquals("String is not Pallindrome",result);
    }

    @Test
    public void givenStringShouldReturnStringISPallindromeWithSpaces()
    {
        Palindrome obj=new  Palindrome();
        //Act
        String result=obj.find_Pallindrome("ABCD DCBA",9);
        assertEquals("String is Pallindrome",result);
    }
}