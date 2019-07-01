package com.stackroute.junittest2;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

    public class Palindrome
    {
        public static String find_Pallindrome(String word,int len)
        {
            String word_dup="";
            if(len<=1)
                return "String is Pallindrome";
            else
            {
                for(int i=len-1;i>=0;i--) {
                    char ch = word.charAt(i);
                    word_dup = word_dup + ch;
                }
            }
            if(word_dup.equalsIgnoreCase(word))
                return "String is Pallindrome";
            else
                return "String is not Pallindrome";

        }
    }
