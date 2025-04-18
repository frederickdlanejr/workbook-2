package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the person's full name: ");
        String fullname = scanner.nextLine();

        System.out.println("What is the person's age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is the person's profession: ");
        String profession = scanner.nextLine();

        displayPerson(fullname, age, profession);
        savePerson(fullname, age, profession);


    }

    public static void displayPerson(String fullname, int age, String profession){
            System.out.printf("Person %s is a %s and is %d years old.", fullname, profession, age);
    }
    public static void savePerson(String fullname, int age, String profession){

    }
}