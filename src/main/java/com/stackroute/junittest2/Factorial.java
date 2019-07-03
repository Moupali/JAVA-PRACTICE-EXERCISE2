/*7. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1
The factorial of 2 is 2
..........
The factorial of 12 is 479001600
he factorial of 13 is out of range
Modify your program and add a method called longFactorial to list all the factorial that can
be expressed as a long (64-bit signed integer).The maximum value for long is kept in a
constant called Long.MAX_VALUE.*/

package com.stackroute.junittest2;

import java.math.BigDecimal;

public class Factorial {
    //BigDecimal ob = new BigDecimal("234567890000000987654321234567");
    //BigDecimal ob2 = new BigDecimal("123456789009876543232456");

    public String longFactorial()
    {
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        System.out.println("List of factorils under long value is");

        for (int i = 1; ; i++)
        {
            if (ob1.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 && ob1.multiply(new BigDecimal(i+1)).compareTo(new BigDecimal(Long.MAX_VALUE))<0) {
                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp=outp+"\n";

            }
            else
                {
                break;
                }
        }
        return outp;

    }
    public String intFactorial()
    {
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        BigDecimal ob2;
        int j=1;
        System.out.println("List of factorials under int value is");

        for (int i = 1; ; ) {
            if (ob1.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0&&ob1.multiply(new BigDecimal(i+1)).compareTo(new BigDecimal(Integer.MAX_VALUE))<0){
                ob2=ob1;

                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp=outp+"\n";

            }
            else{
                break;
            }
            i++;
        }
        //System.out.println(ob1);
        return outp;

    }


}
