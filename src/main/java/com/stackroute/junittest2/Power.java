package com.stackroute.junittest2;

public class Power {
    public boolean powerOfFour(int num)
    {
        while(num>0)
        {
            if(num==1)
            {
                return true;
            }
            if(num%4 !=0){

                return false;
            }
            else{
                num=num/4;
            }
        }
        return false;
    }
}
