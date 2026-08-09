/*
    PRACTICE ASSIGNMENT: JAVA PROGRAMMING FUNDAMENTALS
    PAWAN KOSHTI
    125B1F079
    A2
*/ 
import java.lang.*;
import java.util.*;

public class OOP{
    //1) Variables, data types, operators and input/output
    public static void basics(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the world of OOP's");
        int a=1,b=2;
        System.out.println("a= "+a+" b= "+b);
        System.out.println("a + b = "+a+b);
        System.out.println("Enter the numbers that you want to multiply:");
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("ANS = "+c*d);
    }
    //2) Conditional Statements(if,if else and switch)
    public static void ConditionalStatements(){
        Scanner sc = new Scanner(System.in);
        int ch;
        do{   
        System.out.println("**************MENU****************");
        System.out.println("1)check eligibilty for voting");
        System.out.println("2)calculate square of a number");
        System.out.println("3)calculate area of a triangle");
        System.out.println("4)EXIT");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                if(age>=18){
                    System.out.println("You are eligible for voting");
                    System.out.println("Do you want to apply for voter id(Y/N)");
                    char app=sc.next().charAt(0);
                    if(app==(char)'Y'||app=='y'){
                        System.err.println("This is not an government site please visit the official website!!!");
                    }
                }else{
                    System.out.println("You are not eligible for voting: ");
                }
                break;
            case 2:
                System.out.print("please enter your number:");
                int a=sc.nextInt();
                int square = a*a;
                System.out.println("Square of your number is: "+square);
                break;

            case 3:
                System.out.print("enter height of the triangle: ");
                int h = sc.nextInt();
                System.out.print("Enter base of your triangle: ");
                int b = sc.nextInt();
                float area=(float)0.5*b*h;
                System.out.println("Area of your triangle is: "+area);
                break;
        }
        }while(ch!=4);
    }
    public static void numberSeries(){
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
            System.out.println("******************MENU*******************");
            System.out.println("1) To display even numbers");
            System.out.println("2) To display odd numbers");
            System.out.println("3) To check if number is prime or not");
            System.out.println("4) EXIT");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    for(int i=1;i<=10;i++){
                        if(i%2==0){
                            System.out.print(i+" ");
                        }
                        
                    }
                    System.out.println();
                    break;

                case 2:
                     for(int i=1;i<=10;i++){
                        if(i%2!=0){
                            System.out.print(i+" ");
                        }
                    } 
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter your number: ");
                    int p = sc.nextInt();
                    int flag=0;
                    for(int i=2;i<p;i++){
                        if(p%i==0){
                            flag++;
                            break;
                        }
                    } 
                    if(flag!=0){
                        System.out.println("your number is not a prime number");
                    }     
            }

        }while(ch!=4);
    }

    //PATTERN 1
    public static void hollowRect(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totrows;j++){
                if(i==1||j==1||i==totrows||j==totrows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    //PATTERN 2
    public static void diamondPalindrome(int totrows){
       for(int i=1;i<=totrows;i++){
            for(int j=1;j<=totrows-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j/10==0){
                System.out.print(" "+j);
                }else{
                    System.out.print(j);
                }
            }
            for(int j=i-1;j>=1;j--){
                if(j/10==0){
                System.out.print(" "+j);
                }else{
                    System.out.print(j);
                }
            }

            System.out.println();
        }
        for(int i=totrows-1;i>=1;i--){
            for(int j=totrows-i;j>=1;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j/10==0){
                System.out.print(" "+j);
                }else{
                    System.out.print(j);
                }
            }
            for(int j=i-1;j>=1;j--){
                if(j/10==0){
                System.out.print(" "+j);
                }else{
                    System.out.print(j);
                }
            }

            System.out.println();
        }
    }
    //PATTERN 3
    public static void hollow_rhombus(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=totrows-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=totrows;j++){
                if(j==1||j==totrows||i==1||i==totrows){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    //PATTERN 4
    public static void butterfly(int totrows){
        for(int i=1;i<=totrows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(totrows-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=totrows-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*(totrows-i);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //ARRAYS
     public static void printSpiral(int matrix[][]){
        int startCol = 0;
        int startRow = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;
        System.out.print("Spiral print of matrix: ");
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int j=startRow + 1; j<endRow; j++){
                System.out.print(matrix[j][endCol-1]+" ");
            }
            //bottom
            for(int j=endCol - 2; j>=startCol; j--){
                System.out.print(matrix[endRow-1][j]+" ");
            }
            //left
            for(int j=endRow - 2; j>=startRow + 1; j--){
                System.out.print(matrix[j][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        System.out.println();
    }
    public static void binarySearch(){
        int arr[]={12,24,32,46,64,78,87,98};
        int key = 46;
        int start=0,end=arr.length;
        while(start<=end){
            int mid = (start + end)/2;
            if(key==arr[mid]){
                System.out.println("Key found at: "+mid+1);
                break;
            }else if(key<arr[mid]){
                end=mid-1;
            }else if(key>arr[mid]){
                start=mid+1;
            }
        }
    }
    public static void factorial(){
        int f=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is: "+f);
    }
    public static void palindrome(){
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string to check palindrome: ");
        str=sc.nextLine();
        int flag=0;
        int left=0;
        int right=str.length()-1;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(left)!=str.charAt(right)){
                flag++;
            }
            left++;
            right--;
        }
        if(flag!=0){
            System.out.println("It is not a palindrome");
        }else{
            System.out.println("It is a palindrome");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("JAVA PROGRAMMING FUNDAMENTALS");
        int ch;
        do{
            System.out.println("***************MENU****************");
            System.out.println("1) Variables, data types, operators and input/output");
            System.out.println("2) Conditional Statements(if,if else and switch)");
            System.out.println("3) Loops (for, while, and do-while)");
            System.out.println("4) PATTERNS-\n\t1.Hollow Rectangle\n\t2.Diamond Palindrome\n\t3.Hollow Rhombus\n\t4.Butterfly");
            System.out.println("5) Arrays");
            System.out.println("6) Binary Search");
            System.out.println("7) Factorial of a number");
            System.out.println("8) To check if string is palindrome");
            System.out.println("9) EXIT");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    basics();
                    break;

                case 2:
                    ConditionalStatements();
                    break;

                case 3:
                    numberSeries();
                    break;

                case 4:
                    System.out.println("Hollow Rectangle");
                    hollowRect(5);
                    System.out.println("Diamond Palindrome");
                    diamondPalindrome(5);
                    System.out.println("Hollow Rhombus");
                    hollow_rhombus(5);
                    System.out.println("Butterfly");
                    butterfly(5);
                    break;
                
                case 5:
                    System.out.println("Enter order of matrix: ");
                    int n = sc.nextInt();
                    int matrix[][]=new int[n][n];
                    for(int i=0; i<n; i++){
                        for(int j=0; j<n; j++){
                            matrix[i][j]=sc.nextInt();
                        }
                    }
                     for(int i=0;i<n;i++){
                        for(int j=0;j<n;j++){
                            System.out.print(matrix[i][j]+" ");
                        }
                        System.out.println();
                    }
                    printSpiral(matrix); 
                    break;
                
                case 6:
                    binarySearch();
                    break;
                
                case 7:
                    factorial();
                    break;
                
                case 8:
                    palindrome();
                    break;
                
                case 9:
                    System.out.println("THANK YOU!!!!");
                    break;
                
            }
        }while(ch!=9);
    }
}
