package com.stackroute.junittest2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
     MemberVariable obj;
    @Before
    public void setUp() throws Exception {
        obj=new MemberVariable();

        System.out.println("After");
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
        System.out.println("Before");
    }

    @Test
    public void returnMemberVariable()
    {
        String result = obj.inputDetails("Moupali Dutta", 21, 28000.0f);

        assertEquals("Members Name:Moupali Dutta\nMembers Age:21\nMembers Salary:28000.0", result);
    }
}