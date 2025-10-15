package academy.devdojo.javaoneforall.javacore.oexception.exception.test;

import academy.devdojo.javaoneforall.javacore.oexception.exception.domain.InvalidLoginException;

import java.util.Scanner;

public class InvalidLoginTest01 {
    public static void main(String[] args) {
        try {
            Login();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }

    public static void Login() throws InvalidLoginException {
        Scanner input = new Scanner(System.in);
        String username = "River";
        String password = "Anya4Johnny";
        System.out.print("User: ");
        String usernameDigits = input.nextLine();
        System.out.print("Password: ");
        String passwordDigits = input.nextLine();

        if(!username.equals(usernameDigits) || !password.equals(passwordDigits)) {
            throw new InvalidLoginException("Invalid user or password does't match.");
        }

        System.out.println("Login Successful");

    }
}
