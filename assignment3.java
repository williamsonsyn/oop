
import java.util.*;

public class assignment3{
    static class customer{
        String accNo;
        String name;
        int bal;
        customer(){

        };
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        customer cust[]=new customer[10];
        int ch,records;
        do{
        System.out.println("**************BANK OF MAHARASHTRA**************");
        System.out.println("******************** MENU *********************");
        System.out.println("\n1) ADD ACCOUNT\n2) REMOVE ACCOUNT\n3) DEPOSIT MONEY\n4) WITHDRAW MONEY\n5) SHOW RECORDS\n6) EXIT");
        System.out.print("ENTER YOUR CHOICE: ");
        ch=sc.nextInt();
         switch(ch){
            case 1:
                char chh;
                do{
                int i;
                System.out.println("How many Accounts do you want to add: ");
                i = sc.nextInt();
                sc.nextLine();
                for(int j=0;j<i;j++){
                    cust[j]=new customer();

                    System.out.println("Account number: ");
                    cust[j].accNo=sc.nextLine();

                    System.out.println("Enter account holder name: ");
                    cust[j].name=sc.nextLine();

                }
                System.out.println("Do you want to add more accounts?(y/n)");
                chh = sc.next().charAt(0);
                }while(chh=='y'||chh=='Y');
                 
                break;
            
             
         }
        }while(ch!=6);
    }
}
