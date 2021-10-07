//Write a C program to find sum of all odd numbers between 1 to n.
import java.util.*;
public class OddSum{
    public static void main(String args[]){
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            if(i%2!=0){
               sum=sum+i; 
            }
            
        }
        System.out.println("sum pf all even numbers are: "+sum);
    }
}