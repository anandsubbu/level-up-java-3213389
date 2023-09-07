package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static boolean isPasswordComplex(String password) {
        return password.length() >= 6 
            && password.matches(".*\\d.*")
            && password.matches(".*[a-z].*")
            && password.matches(".*[A-Z].*");
            
        // six chars, one uppercase, one lowercase, one number
        // if (password.length() < 6) {
        //     return false;
        // }

        // boolean hasLowerCaseLetters = false;
        // boolean hasUpperCaseLetters = false;
        // boolean hasNumbers = false;

        // for (int i = 0; i < password.length() || !hasLowerCaseLetters
        //         && !hasUpperCaseLetters && !hasNumbers; i++) {
        //     char currChar = password.charAt(i);
        //     if (Character.isDigit(currChar)) {
        //         hasNumbers = true;
        //     } else if (Character.isUpperCase(currChar)) {
        //         hasUpperCaseLetters = true;
        //     } else if (Character.isLowerCase(currChar)) {
        //         hasLowerCaseLetters = true;
        //     }
        // }
        // return (hasLowerCaseLetters && hasNumbers && hasUpperCaseLetters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        String userInput = scanner.nextLine();
        System.out.println("Is the password complex? "
                + isPasswordComplex(userInput));

        scanner.close();
    }
}
