//Write a C program to print all even numbers between 1 to 100. - using while     loop
import java.util.*;
public class EvenWhile{
    public static void main(String args[]){
        
        //Scanner s = new Scanner(System.in);
        int c=1;
        System.out.println("even numbers are:");
        while(c<=100){
            if(c%2==0){
                System.out.println(c);
                
            }
            c++;
            
        }
    }
}