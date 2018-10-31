package com.company;

public class Main {

    public static void main(String[] args) {

        Person person_1 = new Person();
        person_1.setFirstName("John");
        person_1.setLastName("Doe");

        Person person_2 = new Person("John", "Doe");

        System.out.println(person_1.equals(person_2));

        System.out.println(person_1.toString());
        System.out.println(person_2.toString());

    }
}
