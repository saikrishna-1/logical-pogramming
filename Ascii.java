//Write a C program to print all ASCII character with their values.
import java.util.*;
public class Ascii{
    public static void main(String args[]){
        for(int i=0;i<=255;i++){
           System.out.println(" The ASCII value of " + (char)i + "  =  " + i); 
        }
    }
}