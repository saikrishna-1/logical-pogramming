//Write a C program to input any character and check whether it is alphabet, digit    or special character.
import java.util.*;
public class Digit{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the character value");
        char c = s.next().charAt(0);
        if((c>'a'&&c<'z')||(c>'A'&&c<'Z')){
            System.out.println("is a character ");
        }
        else if(c>'0'&&c<'9'){
            System.out.println("is a digit");
        }
        else{
            System.out.println("is a special character");
        }
    }
}