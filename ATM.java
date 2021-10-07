//89. WAP to Display the ATM Transaction
import java.util.*;

public class ATM{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        System.out.println("enter the balance amount");
        int balance = s.nextInt();
        System.out.println("option-1: cashwithdraw");
        
        System.out.println("option-2: cashdeposit");
        //double cashdeposit = s.nextDouble();
        System.out.println("option-3: balance enquiry");
        System.out.println("optiion-4: exit");
        System.out.println("enter the option value");
        int a = s.nextInt();
        switch(a){
            case 1:
               
                System.out.println("enter the withdrawel");
                int cashwithdraw = s.nextInt();
                if(balance>=cashwithdraw){
                    balance = balance-cashwithdraw;
                    
                    System.out.println("balance is: "+balance);
                }
                else{
                    System.out.println("insuffiecient balance");
                }
                break;
            case 2:
                System.out.println("enter the deposit value");
                int deposit = s.nextInt();
                balance=balance+deposit;
                System.out.println("total balance: "+balance);
                break;
            
            case 3:
                System.out.println("balance is: "+balance);
            case 4:
                System.exit(0);
            
        }
    }
}