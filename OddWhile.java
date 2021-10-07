//Write a C program to print all odd number between 1 to 100.
import java.util.*;
public class OddWhile{
    public static void main(String args[]){
        
        //Scanner s = new Scanner(System.in);
        int c=1;
        System.out.println("even numbers are:");
        while(c<=100){
            if(c%2!=0){
                System.out.println(c);
                
            }
            c++;
            
        }
    }
}