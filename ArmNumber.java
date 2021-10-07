//44. Write a C program to print all Armstrong numbers between 1 to n.
import java.util.*;
public class ArmNumber
{
    public static void main(String[] args) 
     {
        int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to 1000:");
        for(int i=1;i<=500;i++){
            n=i;
            while(n>0){
                b=n%10;
                sum=sum+(b * b * b);
                n=n/10;
            }
            if(sum==i){
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}