//Write a C program to find frequency of each digit in a given integer.
import java.util.*;
public class Frequency{
    public static void main(String args[]){
        int count=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value");
        int n= s.nextInt();
        System.out.println("enter the digit value ");
        int d=s.nextInt();
        while(n!=0){
            if(n%10==d){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}