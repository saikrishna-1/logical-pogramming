// Write a C program to check whether a character is alphabet or not.
import java.util.*;
public class Alphabet{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the character value");
        char c = s.next().charAt(0);
        if((c>'a'&&c<'z')||(c>'A'&&c<'Z')){
            System.out.println("is a character ");
        }
        else{
            System.out.println("not a character");
        }
    }
}