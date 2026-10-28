/*
    Assignment 7:In-Built Exceptions
    PAWAN KOSHTI
    125B1F079
    A2
*/
/*
Implementing Exception Handling in Java Using In-Built Exceptions 
*/


import java.util.InputMismatchException;
import java.util.Scanner;


public class assignment72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // --- 1. ArithmeticException ---
        try {
            System.out.println("--- Step 1: Division ---");
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();
            System.out.print("Enter denominator : ");
            int b = sc.nextInt();


            int result = a / b;
            System.out.println("Division = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        }
        catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input format. Expected an integer.");
            sc.nextLine();
        }
        finally {
            System.out.println("Step 1 finished.\n");
        }


        // --- 2. NegativeArraySizeException ---
        try {
            System.out.println("--- Step 2: Array Creation ---");
            System.out.print("Enter array size : ");
            int size = sc.nextInt();


            int[] arr = new int[size];
            System.out.println("Array created successfully with size: " + size);
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Exception: Array size cannot be negative.");
        }
        catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input format. Expected an integer.");
            sc.nextLine();
        }
        finally {
            System.out.println("Step 2 finished.\n");
        }


        // --- 3. ArrayIndexOutOfBoundsException ---
        try {
            System.out.println("--- Step 3: Array Access ---");
            int[] sampleArray = {10, 20, 30};
            System.out.print("Enter index to access (0 to 2 are valid, others trigger exception): ");
            int index = sc.nextInt();


            System.out.println("Array element = " + sampleArray[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception: Invalid array index.");
        }
        catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input format. Expected an integer.");
            sc.nextLine();
        }
        finally {
            System.out.println("Step 3 finished.\n");
        }


        // --- 4. StringIndexOutOfBoundsException ---
        try {
            sc.nextLine();
            System.out.println("--- Step 4: String Index Access ---");
            System.out.print("Enter a word: ");
            String str = sc.nextLine();
            System.out.print("Enter character index to extract: ");
            int strIndex = sc.nextInt();


            System.out.println("Character at index " + strIndex + " = " + str.charAt(strIndex));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception: String index is out of bounds.");
        }
        catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input format. Expected an integer.");
            sc.nextLine();
        }
        finally {
            System.out.println("Step 4 finished.\n");
        }


        // --- 5. NumberFormatException ---
        try {
            sc.nextLine();
            System.out.println("--- Step 5: Parse String to Number ---");
            System.out.print("Enter a number string (e.g. '123' vs 'abc'): ");
            String numStr = sc.nextLine();


            int parsedNum = Integer.parseInt(numStr);
            System.out.println("Parsed integer value = " + parsedNum);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception: String contains non-numeric characters.");
        }
        finally {
            System.out.println("Step 5 finished.\n");
        }


        System.out.println("Program execution completed successfully !!!");
        sc.close();
    }
}

