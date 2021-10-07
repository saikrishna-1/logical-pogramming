//Write a C program to check whether a number is negative, positive or zero.
import java.util.*;
public class Positive{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n=s.nextInt();
        if(n<0){
            System.out.println("value is negative");
        }
        else if(n>0){
            System.out.println("value is positive");
            
        }
        else{
            System.out.println("value is zero");
        }
    }
}