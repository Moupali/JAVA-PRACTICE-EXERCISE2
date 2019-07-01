package com.stackroute.junittest2;

public class Power
{
    public boolean powerOfFour(int number)
    {
        while(number>0)
        {
            if(number==1)
            {
                return true;
            }
            if(number%4 !=0){

                return false;
            }
            else{
                number=number/4;
            }
        }
        return false;
    }
}
