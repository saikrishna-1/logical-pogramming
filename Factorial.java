//Write a C program to calculate factorial of a number.
import java.util.*;
public class Factorial{
    public static void main(String args[]){
        int fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}