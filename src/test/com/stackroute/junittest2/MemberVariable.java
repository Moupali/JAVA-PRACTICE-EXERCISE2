package com.stackroute.junittest2;

 class Member
{
    String Name;
    int age;
    double salary;
}
public class MemberVariable
{
    //instance creation
    Member obj=new Member();
    String output="";

    public String inputDetails(String Name,int age,double salary)
    {
        obj.Name=Name;
        obj.age=age;
        obj.salary=salary;
        output=output+"Members Name:"+obj.Name+"\n";
        output=output+"Members Age:"+obj.age+"\n";
        output=output+"Members Salary:"+obj.salary;

        return output;

    }

}
