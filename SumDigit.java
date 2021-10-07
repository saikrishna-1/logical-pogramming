//Write a C program to calculate sum of digits of a number.
import java.util.*;
public class SumDigit{
    public static void main(String args[]){
        int sum=0,digit;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value");
        int n = s.nextInt();
        while(n!=0){
            digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }
}