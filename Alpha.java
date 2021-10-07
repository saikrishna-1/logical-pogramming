//Write a C program to print all alphabets from a to z. - using while loop
import java.util.*;
public class Alpha{
    public static void main(String args[]){
        
        Scanner s = new Scanner(System.in);
        char c='a';
        System.out.println("alphabets are:");
        while(c<='z'){
            System.out.println(c);
            c++;
        }
    }
}