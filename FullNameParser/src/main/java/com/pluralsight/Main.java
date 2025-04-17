package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("What is your name?: ");
        String name = scanner.nextLine().trim();


        int firstSpaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, firstSpaceIndex);

        int secondSpaceIndex = name.indexOf(" ", firstSpaceIndex + 1);
        String middleName;
        String lastName;

        if (secondSpaceIndex >= 0) {

            middleName = name.substring(firstSpaceIndex + 1, secondSpaceIndex);
            lastName = name.substring(secondSpaceIndex + 1);
        } else {
            middleName = "(None)";
            lastName = name.substring(firstSpaceIndex + 1);
        }


        System.out.println();
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
