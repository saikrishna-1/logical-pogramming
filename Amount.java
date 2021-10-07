//Write a C program to count total number of notes in given amount.
import java.util.*;
public class Amount{
    public static void main(String args[]){
        int rem=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the amount value");
        int amt = s.nextInt();
        if(amt>=2000&&amt%2000==0||amt%2000!=0){
            
            rem=amt/2000;

            System.out.println(rem);
            if(amt>=500&&amt<=2000&&amt/500==0||amt/500!=0){
            rem=amt/500;
            System.out.println(rem);
            if(amt>=200&&amt<500&&amt/200==0||amt/200!=0){
            rem=amt/200;
            System.out.println(rem);
        }
            
        }
            
        }
        // else if(amt>=500&&amt<=2000&&amt/500==0||amt/500!=0){
        //     rem=amt/500;
        //     System.out.println(rem);
            
        // }
        // else if(amt>=200&&amt<500&&amt/200==0||amt/200!=0){
        //     rem=amt/200;
        //     System.out.println(rem);
        // }
    }
}