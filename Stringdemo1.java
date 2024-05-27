package Labquetions;

import java.util.Scanner;

//WAP to search given student name is available in the list of student name using String array.



public class Stringdemo1 {
	public static void main(String[] args) {
        // Array of student names
        String[] studentNames = {"Tejas", "Shubham", "Ravi", "Yash", "Raj", "Omkar"};

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the name to search for
        System.out.println("Enter the name to search for: ");
        String searchName = scanner.nextLine();

        // Call the searchStudent method to check if the name is in the array
        boolean found = searchStudent(studentNames, searchName);

        // Display the result based on whether the name was found or not
        if (found) {
            System.out.println(searchName + " is found in the list of student names.");
        } else {
            System.out.println(searchName + " is not found in the list of student names.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to search for a student name in the array
    public static boolean searchStudent(String[] names, String target) {
        // Iterate through each name in the array
        for (String name : names) {
            // Check if the current name matches the target name
            if (name.equals(target)) {
                // If found, return true
                return true;
            }
        }
        // If not found after iterating through all names, return false
        return false;
    }
}


