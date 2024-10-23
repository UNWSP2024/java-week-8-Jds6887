package work4;

import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        HashMap userCredentials = new HashMap<>();
        HashMap userMessages = new HashMap<>();


        userCredentials.put("hysmith", "sm8byebye");
        userCredentials.put("tgnelson", "SnB8ky");
        userCredentials.put("rdokafor", "n!@hyj");
        userCredentials.put("jdoe", "password123");
        userCredentials.put("asmith", "qwerty");

        userMessages.put("hysmith", "Hi Henry. Please call me by 7:00 this evening.");
        userMessages.put("tgnelson", "What is up dog?");
        userMessages.put("rdokafor", "This is Jill. Are you coming to my birthday party?");
        userMessages.put("jdoe", "Welcome John! Don't forget your meeting at noon.");
        userMessages.put("asmith", "Hello Alice! Your report is due tomorrow.");


        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();


        if (userCredentials.containsKey(username) && 
            userCredentials.get(username).equals(password)) {
            System.out.println(userMessages.get(username));
        } else {

            System.out.println("Error: Invalid username or password.");
            return; 
        }
        
        scanner.close();
    }
}