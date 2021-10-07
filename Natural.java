//Write a C program to print all natural numbers from 1 to n. - using while loop
import java.util.*;
public class Natural{
    public static void main(String args[]){
        int i=1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        System.out.println("natural numbers are:");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}