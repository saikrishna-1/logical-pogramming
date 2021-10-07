//Write a C program to calculate product of digits of a number.
import java.util.*;
public class ProductDigit{
    public static void main(String args[]){
        int product=1,digit;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value");
        int n = s.nextInt();
        while(n!=0){
            digit=n%10;
            product=product*digit;
            n=n/10;
            
        }
        System.out.println(product);
        
    }
}