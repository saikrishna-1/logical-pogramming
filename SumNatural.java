//Write a C program to find sum of all natural numbers between 1 to n.
import java.util.*;
public class SumNatural{
    public static void main(String args[]){
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum pf all natural numbers are: "+sum);
    }
}