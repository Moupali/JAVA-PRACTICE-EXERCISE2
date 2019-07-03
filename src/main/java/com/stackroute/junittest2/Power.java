/*Write a Java method to check if a given number is power of 4*/

package com.stackroute.junittest2;

public class Power
{
    //will find power of 4
    public boolean powerOfFour(int number)
    {

        while (number > 0) {
            if (number == 1) {
                return true;
            }
            if (number % 4 != 0) {

                return false;
            } else {
                number = number / 4;
            }
        }
        return false;

    }
}
