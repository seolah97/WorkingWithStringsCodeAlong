package com.sb;

import java.util.Scanner;
public class FullNameGenerator {
    public static void main(String[] args) {
        Scanner userScanner = new Scanner(System.in);
        //! is used to signal "not"
        String fullName = ("");
        //print ln- will drop answer to a new line.  print-will prompt answer right next to question.
        System.out.println("Please enter your name");

        // Prompt user for first name, Make sure to trim
        System.out.print("First name: ");
        String firstName = userScanner.nextLine().trim();

        // Prompt user for middle name "", Make sure to trim
        System.out.print("Middle name: ");
        String middleName = userScanner.nextLine().trim();

        // Prompt user for last name, Make sure to trim
        System.out.print("Last name: ");
        String lastName = userScanner.nextLine().trim();

        // Prompt user for suffix, Make sure to trim
        System.out.print("Suffix: ");
        String suffix = userScanner.nextLine().trim();

        // Add first name to fullNameVariable
        fullName += firstName + " ";

        // * Add Middle name to fullNameVariable, Making sure to have whitespace
        if(!middleName.equals("")) {
            fullName += middleName + " ";
        }

        // Add last name to fullNameVariable
        fullName += lastName;

        // if there is a suffix, add (", " + suffix) to fullNameVariable
        // Otherwise do nothing
        if(!suffix.equals("")){
            fullName += ", " + suffix;
        }

        // Print out full name
        System.out.println("Full name: " + fullName);

    }

}