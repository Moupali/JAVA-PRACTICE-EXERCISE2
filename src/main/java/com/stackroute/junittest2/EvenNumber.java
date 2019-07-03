/*5. Write a boolean method called isEven() in a class called EvenNumTest, which takes
an int as input and returns true if the input is even. The signature of the method is as
follows: public static boolean isEven(int number)*/

package com.stackroute.junittest2;

public class EvenNumber
{

    public static boolean isEven(int number)
    {
        //it checks whether the number is divisible by 2 or not.
        if (number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
