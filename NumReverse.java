// Write a C program to enter a number and print its reverse.
import java.util.*;
public class NumReverse{
    public static void main(String args[]){
        int rev=0,rem;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n=s.nextInt();
        while(n!=0){
            rem=n%10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
