//Write a C program to find power of a number using for loop.
import java.util.*;
public class Power{
    public static void main(String args[]){
        int power=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the base number");
        int base = s.nextInt();
        System.out.println("enter the exponent number");
        int exp=s.nextInt();
        for(int i=1;i<=exp;i++){
            power = power*base;
        }
        System.out.println(power);
    }
}