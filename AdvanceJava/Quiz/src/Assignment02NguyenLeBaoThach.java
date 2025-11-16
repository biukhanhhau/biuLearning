/*
 * Author: Nguyen Le Bao Thach
 * Course: CST8116 - Introduction to Computer Programming
 * Assignment 2
 * Date: Fall 2025
 */
import java.util.Random;
import java.util.Scanner;
public class Assignment02NguyenLeBaoThach {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scnr.nextLine(); // reads the full name (including spaces)
        int index = 0;
        int asciiSum = 0;
// While loop to add up ASCII values
// it will happen an Exception name StringIndexOutOfBoundsException because the charAt() count form 0 while the length() count from 1
        while (index < studentName.length()) {
            char ch = studentName.charAt(index); // get character at index
            asciiSum += (int) ch; // add its ASCII value
        }
        System.out.println("Student Name: " + studentName);
        System.out.println("Sum of ASCII values: " + asciiSum);
// Print your name (assignment requirement)
        System.out.println("\nEnd of program. Stay cool! Program by Nguyen Le Bao Thach");
    }
}
