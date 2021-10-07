//Write a C program to find maximum between two numbers.
import java.util.*;
public class Max{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter thte a value");
        int a =s.nextInt();
        System.out.println("enter the b value");
        int b=s.nextInt();
        if(a>b){
            System.out.println("max : "+a);
        }
        else{
            System.out.println("max:" +b);
        }
    }
}
