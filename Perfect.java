//45. Write a C program to check whether a number is Perfect number or not.
import java.util.*;
public class Perfect{
    public static void main(String args[]){
        int i=1,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        while(i<=n/2){
            if(n%i==0){
                sum=sum+i;
            }
            i++;
        }
        if(sum==n){
            System.out.println("id perfect number");
        }
        else{
            System.out.println("not a perfect square");
        }
    }
}