package work3;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemListManager {
    public static void main(String[] args) {
        ArrayList itemList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Welcome to the Item List Manager!");

        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Edit an item");
            System.out.println("4. View all items");
            System.out.println("Type 'exit' to quit.");

            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            switch (command) {
                case "1":
                    System.out.print("Enter the item you want to add: ");
                    String newItem = scanner.nextLine();
                    itemList.add(newItem);
                    System.out.println(newItem + " has been added.");
                    break;

                case "2":
                    System.out.print("Enter the index of the item you want to remove (0 - " + (itemList.size() - 1) + "): ");
                    int removeIndex = Integer.parseInt(scanner.nextLine());
                    if (removeIndex >= 0 && removeIndex < itemList.size()) {
                        String removedItem = (String) itemList.remove(removeIndex);
                        System.out.println(removedItem + " has been removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case "3":
                   // Editing logic remains unchanged
                   // ...
                   break;

                case "4":
                   // Viewing logic remains unchanged
                   // ...
                   break;

                default:
                   // Default message remains unchanged
                   // ...
                   break;
           }
       }

       scanner.close();
       // Closing message remains unchanged
   }
}