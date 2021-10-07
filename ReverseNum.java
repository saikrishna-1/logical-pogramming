//Write a C program to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.*;
public class ReverseNum{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        System.out.println("natural numbers are:");
        while(n>=1){
            System.out.println(n);
            n--;
        }
    }
}