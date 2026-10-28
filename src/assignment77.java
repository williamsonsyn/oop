/*
    Assignment 7:User-Defined Exceptions
    PAWAN KOSHTI
    125B1F079
    A2
*/
/*
Implement a basic stack data structure using arrays and apply Java's try and catch blocks
to handle stack overflow and underflow exceptions.
*/
import java.util.Scanner;

public class assignment77 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch ;

        do {
            System.out.println("----Menu----");
            System.out.println("1.Push element");
            System.out.println("2.Pop element");
            System.out.println("3.Is the stack empty??");
            System.out.println("4.Is the stack full??");
            System.out.println("5.Exit");
            System.out.println("\nEnter option: ");

            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("\nEnter value to add: ");
                    
                    
                    try {
                        int value = sc.nextInt();
                        push(value);
                    }
                    catch(StackFullException e) {
                        System.out.println(e.getMessage());
                    }
                    catch(Exception e){
                        System.out.println("\u001B[31mError: Invalid data type!\u001B[0m");
                        sc.next();
                    }
                    break;

                case 2:
                    try {
                        int x = pop();
                        System.out.println("Popped element: " + x);
                    }
                    catch(StackEmptyException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    if(isEmpty())
                    {
                        System.out.println("The stack is empty.");
                    }
                    else
                    {
                        System.out.println("The stack is not empty.");
                    }
                    break;

                case 4:
                    if(isFull())
                    {
                        System.out.println("The stack is full.");
                    }
                    else
                    {
                        System.out.println("The stack is not full.");
                    }
                    break;

                case 5:
                    System.out.println("EXITING....");
                    break;

                default:
                    System.out.println("Please enter valid option");
            }

        } while(ch != 5);

        sc.close();
    }

    static Stack s = new Stack();

    static class Stack
    {
        int[] arr = new int[5];
        int top = -1;
    }
    

    static void push(int value) throws StackFullException
    {
        if(isFull())
        {
            throw new StackFullException("\u001B[31mError: Stack is Full!\u001B[0m");
        }else{
        s.top++;
        s.arr[s.top] = value;
        }
    }

    static int pop() throws StackEmptyException
    {
        if(isEmpty())
        {
            throw new StackEmptyException("\u001B[31mError: Stack is Empty!\u001B[0m");
        }else{
        int value = s.arr[s.top];
        s.top--;
        return value;
        }
    }
    static boolean isEmpty()
    {
        return s.top == -1;
    }
    static boolean isFull()
    {
        return s.top == (s.arr.length) - 1;
    }
    // Exception for full stack
    static class StackFullException extends Exception
    {
        public StackFullException(String message)
        {
            super(message);
        }
    }

    // Exception for empty stack
    static class StackEmptyException extends Exception
    {
        public StackEmptyException(String message)
        {
            super(message);
        }
    }
}