/*Write a Java method to Reverse the given input & Check if it is a Palindrome.*/

package com.stackroute.junittest2;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

    public class Palindrome
    {
        public static String find_Pallindrome(String word,int length)
        {
            String word_duplicate="";

            if(length<=1)
                return "String is Pallindrome";
            else
            {
                //Reverse for loop
                for(int i=length-1;i>=0;i--)
                {
                    char ch = word.charAt(i);
                    word_duplicate = word_duplicate + ch;
                }
            }
            if(word_duplicate.equalsIgnoreCase(word))
                return "String is Pallindrome";
            else
                return "String is not Pallindrome";

        }
    }
