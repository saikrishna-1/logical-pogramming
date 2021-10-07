//Write a C program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
public class Divisible{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        if(n%5==0||n%11==0){
            System.out.println("value is divisible by 5 and 11");
        }
        else{
            System.out.println("value is not divisible by 5 and 11");
        }
    }
}