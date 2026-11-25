package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Calculate average when total count is zero (ArithmeticException)
        try {
            int totalMarks = 450;
            int studentCount = 0;
            int average = totalMarks / studentCount;
            System.out.println("Average marks: " + average);
        } catch (ArithmeticException e) {
            System.out.println("1. ArithmeticException caught: Cannot divide by zero (student count is 0).");
        }

        // 2. Access a student record using an invalid array index (ArrayIndexOutOfBoundsException)
        try {
            int[] studentMarks = {85, 90, 78};
            System.out.println("Student mark: " + studentMarks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("2. ArrayIndexOutOfBoundsException caught: Invalid student record index.");
        }

        // 3. Access an invalid character position in a username (StringIndexOutOfBoundsException)
        try {
            String username = "rahul_01";
            char ch = username.charAt(20);
            System.out.println("Character at index 20: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("3. StringIndexOutOfBoundsException caught: Character index is out of range.");
        }

        // 4. Access a student's name when the name is null (NullPointerException)
        try {
            String studentName = null;
            System.out.println("Name length: " + studentName.length());
        } catch (NullPointerException e) {
            System.out.println("4. NullPointerException caught: Student name is null.");
        }

        // 5. Enter a string instead of an integer for student marks (InputMismatchException)
        try {
            System.out.print("Enter student marks (try entering text like 'abc'): ");
            int marks = sc.nextInt();
            System.out.println("Entered marks: " + marks);
        } catch (InputMismatchException e) {
            System.out.println("5. InputMismatchException caught: Please enter a valid integer for marks.");
        } finally {
            sc.close();
        }
    }
}






