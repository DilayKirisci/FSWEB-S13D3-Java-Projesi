package com.workintech.model;

public class Person{

    String firstName;
    String lastName;
    int age;
    double wage;
    boolean single;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age,double wage, boolean single){
        this(firstName, lastName, age);
        this.wage = wage;
        this.single = single;
    }

    public String getFirstName(){
    return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if(age< 18 && age > 12){
            return true;
        }else{
            return false;
        }
    }


}

