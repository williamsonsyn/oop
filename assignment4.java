import java.util.*;
public class assignment4{
   
    public static double area(double a){
        return a*a;
    }
     public static double area(double a,double b){
        return a*b;
    }
    public static double area(double a,double b,double c){
        double s = (a+b+c)/2;
        double area;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    public static double perimeter(double a){
        return 4*a;
    }
    public static double perimeter(double a,double b){
       return 2*(a+b); 
    }
    public static double perimeter(double a,double b,double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do{
        System.out.println("***************SHAPE CRAFT*****************");
        System.out.println("******************MENU********************");
        System.out.println("1)Calculate area of:SQUARE");
        System.out.println("2)Calculate area of:RECTANGLE");
        System.out.println("3)Calculate area of:TRIANGLE");
        System.out.println("4)Calculate perimeter of:SQUARE");
        System.out.println("5)Calculate perimeter of:RECATNGLE");
        System.out.println("6)Calculate perimeter of:TRIANGLE");
        System.out.println("7)EXIT");
        System.out.println("CHOOSE your option:");
        ch=sc.nextInt();
        switch(ch){
            case 1:{
                double a;
                System.out.print("Enter side of square:");
                a = sc.nextDouble();
                System.out.println();
                System.out.println("Area of side of square "+a+" is: "+area(a) );
                break;
            }
            case 2:{
                double a,b;
                System.out.print("Enter length of rectangle:");
                a = sc.nextDouble();
                System.out.println();
                System.out.print("Enter breadth of rectangle:");
                b = sc.nextDouble();
                System.out.println();
                System.out.println("Area of length: "+a+" and breadth: "+b+" of a rectangle is: "+area(a,b) );
                break;
            }
            case 3:{
                double a,b,c;
                System.out.print("Enter side 1 of triangle:");
                a = sc.nextDouble();
                System.out.println();
                System.out.print("Enter side 2 of triangle:");
                b = sc.nextDouble();
                System.out.println();
                System.out.print("Enter side 3 of triangle:");
                c = sc.nextDouble();
                System.out.println();
                System.out.println("Area of triangle os sides: "+a+" "+b+" "+c+" is: "+area(a,b,c));
                break;
            }
            case 4:{
                double a;
                System.out.print("Enter side of square:");
                a = sc.nextDouble();
                System.out.println();
                System.out.println("Perimeter of side of square "+a+" is: "+perimeter(a) );
            
                break;
            }
            case 5:{
                double a,b;
                System.out.print("Enter length of rectangle:");
                a = sc.nextDouble();
                System.out.println();
                System.out.print("Enter breadth of rectangle:");
                b = sc.nextDouble();
                System.out.println();
                System.out.println("Perimeter of rectangle of length: "+a+" and breadth: "+b+" is: "+perimeter(a,b) );
                break;
            }
            case 6:{
                double a,b,c;
                System.out.print("Enter side 1 of triangle:");
                a = sc.nextDouble();
                System.out.println();
                System.out.print("Enter side 2 of triangle:");
                b = sc.nextDouble();
                System.out.println();
                System.out.print("Enter side 3 of triangle:");
                c = sc.nextDouble();
                System.out.println();
                System.out.println("Perimeter of triangle of sides: "+a+" "+b+" "+c+" is: "+perimeter(a,b,c));
                break;
            }
            case 7:
                System.out.println("EXITING");
                break;
        }
        }while(ch!=7);


    }

}