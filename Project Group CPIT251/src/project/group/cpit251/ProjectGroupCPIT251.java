package project.group.cpit251;

import java.io.IOException;
import java.util.Scanner;

public class ProjectGroupCPIT251 {

    public static class Main {

        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);

            // Prompt for user credentials
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            // Create an Admin object to check authorization
            Admin admin = new Admin("admin1", "password123");

            if (admin.isAdmin(username, password)) {
                System.out.println("Welcome, Admin!");

                // Admin operations
                FileHandler fileHandler = new FileHandler();
                int choice;
                do {
                    System.out.println("\nAdmin Menu:");
                    System.out.println("1. Add New Information");
                    System.out.println("2. Update a Solution");
                    System.out.println("3. Search for Information");
                    System.out.println("4. Print All Information");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            // Add new information
                            System.out.print("Enter Section: ");
                            String section = scanner.nextLine();
                            System.out.print("Enter Problem: ");
                            String problem = scanner.nextLine();
                            System.out.print("Enter Solution: ");
                            String solution = scanner.nextLine();
                            fileHandler.addNewInformation(section, problem, solution);
                            break;

                        case 2:
                            // Update a solution
                            System.out.print("Enter a keyword to search for the solution: ");
                            String keyword = scanner.nextLine();
                            System.out.print("Enter the new solution: ");
                            String newSolution = scanner.nextLine();
                            fileHandler.updateSolution(keyword, newSolution);
                            break;

                        case 3:
                            // Search for information
                            System.out.print("Enter a keyword to search: ");
                            String searchKeyword = scanner.nextLine();
                            fileHandler.search(searchKeyword);
                            break;

                        case 4:
                            // Print all information
                            fileHandler.printAllInformation();
                            break;

                        case 5:
                            System.out.println("Exiting... Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 5);

            } else {
                System.out.println("Welcome, Employee!");

                // Employee operations
                FileHandler fileHandler = new FileHandler();
                int choice;
                do {
                    System.out.println("\nEmployee Menu:");
                    System.out.println("1. Search for Information");
                    System.out.println("2. Print All Information");
                    System.out.println("3. Exit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (choice) {
                        case 1:
                            // Search for information
                            System.out.print("Enter a keyword to search: ");
                            String searchKeyword = scanner.nextLine();
                            fileHandler.search(searchKeyword);
                            break;

                        case 2:
                            // Print all information
                            fileHandler.printAllInformation();
                            break;

                        case 3:
                            System.out.println("Exiting... Goodbye!");
                            break;

                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 3);
            }

            scanner.close();
        }
    }
}
