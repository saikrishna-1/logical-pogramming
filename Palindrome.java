//Write a C program to check whether a number is palindrome or not.
import java.util.*;
public class Palindrome{
    public static void main(String args[]){
        int rem,sum=0;
       
        Scanner s = new Scanner(System.in);
        System.out.println("enter the palindrome value");
        int n = s.nextInt();
         int temp=n;
        while(n!=0){
            rem=n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}