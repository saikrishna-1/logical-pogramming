//Write a C program to find maximum between three numbers.
import java.util.*;
public class MaxMin{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a value");
        int a=s.nextInt();
        System.out.println("enter the b value");
        int b= s.nextInt();
        System.out.println("enter the c value");
        int c=s.nextInt();
        if(a>b&&a>c){
            System.out.println("max: "+a);
            
        }
        else if(b>c){
            System.out.println("max :"+b);
        }
        else{
            System.out.println("max: "+c);
        }
    }
}