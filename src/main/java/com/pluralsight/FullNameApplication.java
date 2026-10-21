package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your middle name:");
        String middleName=scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName=scanner.nextLine();

        System.out.println("Enter your suffix: ");
        String suffix=scanner.nextLine();

        String fullName=name.trim()+" "+lastName.trim();

        if(middleName.length()>0){
            fullName=name.trim()+" "+" "+middleName.trim().toUpperCase().charAt(0)+". "+lastName.trim();
        }

        if (!suffix.isEmpty()){
            fullName+=", "+suffix.trim();
        }
        System.out.println(fullName);








    }
}
