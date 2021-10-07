//Write a C program to check whether a character is uppercase or lowercase     alphabet.
import java.util.*;
public class UppLow{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       System.out.println("enter the character value");
        char c = s.next().charAt(0);
        if(c>='a'&&c<='z'){
            System.out.println("is a lower case ");
        }
        else if(c>='A'&&c<='Z'){
            System.out.println("is a upper case");
        }
    }
}