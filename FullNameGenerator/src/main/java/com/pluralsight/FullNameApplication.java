package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Your Name");


        System.out.println("First Name: ");
        String firstname = scanner.nextLine().trim();

        System.out.println("Middle Name: ");
        String middlename = scanner.nextLine().trim();

        System.out.println("Last Name: ");
        String lastname = scanner.nextLine().trim();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine().trim();


        String fullname;

        if (middlename.isEmpty() && !suffix.isEmpty()) {
            fullname = firstname + " " + lastname + ", " + suffix;
        } else if (!middlename.isEmpty() && suffix.isEmpty()) {
            fullname = firstname + " " + middlename + " " + lastname;
        } else if (middlename.isEmpty() && suffix.isEmpty()) {
            fullname = firstname + " " + lastname;
        } else {
            fullname = firstname + " " + middlename + " " + lastname + ", " + suffix;
        }

        System.out.println("Full Name: " + fullname);

    } }