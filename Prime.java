//Write a C program to check whether a number is Prime number or not.
import java.util.*;
public class Prime{
    public static void main(String args[]){
        boolean a = false;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                a=true;
                break;
                
            }
            
        }
        if(!a){
            System.out.println("is prime");
            
        }
        else{
            System.out.println("not a prime");
        }
    }
}