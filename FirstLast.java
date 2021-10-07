//Write a C program to find first and last digit of a number.
import java.util.*;
public class FirstLast{
    public static void main(String args[]){
        int firstdigit=0,lastdigit=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number value");
        int n=s.nextInt();
        lastdigit=n%10;
        System.out.println(lastdigit);
        while(n!=0){
            firstdigit=n%10;
            n=n/10;
            
           
        }
        System.out.println(firstdigit);
        
        
    }
}