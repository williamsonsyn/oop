import java.util.*;
public class assignment7{
    public static void main(String[] args){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int ch,a;
        int top=-1;
        do { 
            System.out.println("****STACK****");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Peek");
            System.out.println("4) isEmpty");
            System.out.println("5) isFull");
            System.out.println("6) EXIT");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            System.out.println();
            switch (ch) {
                case 1: 
                    System.out.print("Enter number to push in stack: ");
                    a = sc.nextInt();
                    System.out.println();
                    top++;
                    try{
                        
                    }
                    arr[top]=a;
                    break;
                case 2:
                    System.out.println("pop = "+arr[top]);
                    top--;
                    break;
                case 3:
                    System.out.println("peek = "+arr[top]);
                    break;
                case 4:
                    if(top == -1){
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 5:
                    if(top == 4){
                        System.out.println("Stack is Full");
                    }
                    break;
                case 6:
                    System.out.println("EXITING....");
                    break;
            }
        }while(ch!=6); 

    }


}
class IsFull(){
 
};