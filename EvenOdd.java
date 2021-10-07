//Write a C program to check whether a number is even or odd.
import java.util.*;
public class EvenOdd{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("n is an even");
            
        }
        else{
            System.out.println("n is an odd");
        }
    }
}