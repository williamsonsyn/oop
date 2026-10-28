/*
    Assignment 3:ENCAPSULATION-PACKAGES, ACCESS MODIFIERS, AND DATA HIDING :
    PAWAN KOSHTI
    125B1F079
    A2
*/
import java.util.*;
public class assignment33{
    
    static class Bank {
        int accno;
        String name;
        float bal;
        Bank(int a,String n,float b){
            this.accno=a;
            this.name=n;
            this.bal=b;
            }   
    void deposit(Scanner sc) {
        System.out.println("Enter the amount you want to Deposit: ");
        float amt = sc.nextFloat();
        bal = bal + amt;
        System.out.println("Total Balance = " + bal);
        }
    void withdraw(Scanner sc) {
        System.out.println("Enter the amount you want to Withdraw: ");
        float amt = sc.nextFloat();
        if (amt > bal) {
            System.out.println("Insufficient Balance!");
            } else {    
            bal = bal - amt;
            System.out.println("Total Balance = " + bal);
            }
        }
    }

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int ch;
            int i = 1;
            Bank[] b = new Bank[20];
            System.out.print("Enter Account holder name: ");
            String n = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            float ba = sc.nextFloat();
            sc.nextLine();
            b[0] = new Bank(1,n,ba);
            do {
                System.out.println("\n**** MENU ****");
                System.out.println("1. Add Account");
                System.out.println("2. Remove Account");
                System.out.println("3. Deposit Money");
                System.out.println("4. Withdraw Money");
                System.out.println("5. View a specific Record");
                System.out.println("6. View all Records");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Enter Account holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        float bal = sc.nextFloat();
                        b[i] = new Bank(i+1,name,bal);
                        System.out.println("Account Added Successfully.");
                        System.out.println("Account Number = " + b[i].accno);
                        i++;
                        break;
                    case 2:
                        System.out.println("Enter Account Number to Remove: ");
                        int r = sc.nextInt();
                        for (int j = 0; j < i; j++) {
                            if (b[j] != null && b[j].accno == r) {
                                b[j] = null;
                                System.out.println("Account Removed Successfully.");
                                break;
                                }
                            }
                        break;
                    case 3:
                        System.out.println("Enter Account Number: ");
                        int d = sc.nextInt();
                        if(d>i){
                            System.out.println("Account not present!!");
                            break;
                            }
                        for (int j = 0; j < i; j++) {
                            if (b[j] != null && b[j].accno == d) {
                                b[j].deposit(sc);
                                break;
                                }
                            }   
                        break;
                    case 4:
                        System.out.println("Enter Account Number: ");
                        int w = sc.nextInt();
                        if(w>i){
                            System.out.println("Account not present!!");
                            break;
                            }
                        for (int j = 0; j < i; j++) {
                            if (b[j] != null && b[j].accno == w) {
                                b[j].withdraw(sc);
                                break;
                                }
                            }
                        break;
                    case 5:
                        System.out.println("Enter the Account no:");
                        int x = sc.nextInt();
                        if(x>i || b[x-1]==null){
                            System.out.println("Account not present!!");
                            break;
                            }
                        System.out.println("\nAccount no."+b[x-1].accno);
                        System.out.println("Holder name: "+b[x-1].name);
                        System.out.println("Total Balance: "+b[x-1].bal);
                        break;
                    case 6:
                        System.out.println("\n**** Records ****");
                        for(int k=0;k<=i;k++){
                            if(b[k]!=null){
                                System.out.println("\nAccount no."+b[k].accno);
                                System.out.println("Holder name: "+b[k].name);
                                System.out.println("Total Balance: "+b[k].bal);
                                }
                            }
                            break;
                    case 7:
                        System.out.println("Successfully Exited");
                        break;
                    default:
                    System.out.println("Invalid Choice");
                    }
                } while (ch != 7);
            }
        
}