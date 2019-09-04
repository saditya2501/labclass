package labclass;

import java.util.Scanner;

public class Person {

    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }

    public char getGender() {
        return gender;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = 0;

    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
        @Override
        public String toString() {
        StringBuilder response = new StringBuilder();
        response.append("name:= "+getName());
        response.append("\nAge:= "+getAge());
        response.append("\nGender:= "+getGender());
        return response.toString();


    }
 }
//class Test{
//    public static void main(String[] args){
//        Person person =new  Person("Aditya",20,'M');
//
//    }
//}
