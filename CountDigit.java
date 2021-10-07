//Write a C program to count number of digits in a number.
import java.util.*;
public class CountDigit{
    public static void main(String args[]){
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println("digits are: "+count);
    }
}