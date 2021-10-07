//90. WAP to print reverse case of a given string
import java.util.*;
import java.io.*;
import java.lang.*;

public class Reverse{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("entr a string");
        String str = s.nextLine();
        StringBuilder str1 = new StringBuilder();
        str1.append(str);
        str1.reverse();
        System.out.println("Reverse string is: " +str1);
    }
}