package com.stackroute.junittest2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    Student ob;

    @Before
    public void setUp() throws Exception {

        ob = new Student();
    }

    @After
    public void tearDown() throws Exception {
        ob = null;
    }

    @Test
    public void getNumberOfStudentAndGrades()
    {
        int Grades[] = {98,67,99,77};
        String Result = ob.gradeInput(4,Grades);
        assertEquals("The average is 85.25 The minimum is 67 The maximum is 99",Result);
    }

    @Test
    public void getAvg()
    {
        String Avg = ob.avg(456,4);
        assertEquals("114.0",Avg);
    }

    @Test
    public void getMin()
    {
        int Grades[] = {98,67,99,77};
        int Min = ob.min(Grades,4);
        assertEquals(67,Min);
    }

    @Test
    public void geMax()
    {
        int Grades[] = {98,67,99,77};
        int Max = ob.max(Grades,4);
        assertEquals(99,Max);
    }

    @Test
    public void wrongInputTest1()
    {
        int Grades[] = {55,99,67,99};
        String Result = ob.gradeInput(99,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest2()
    {
        int Grades[] = {55,141,67,99};
        String Result = ob.gradeInput(89,Grades);
        assertEquals("Wrong Input",Result);
    }

    @Test
    public void wrongInputTest3()
    {
        int Grades[] = {55,89,67,99};
        String Result = ob.gradeInput(209,Grades);
        assertEquals("Wrong Input",Result);
    }

}