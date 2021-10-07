//Write a C program to find all factors of a number.
import java.util.*;
public class Factor{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number value");
        int n =s.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
        
    }
}