//Write a C program to input any alphabet and check whether it is vowel or    consonant.

import java.util.*;
public class Vowel{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the character value");
        char c = s.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("is a an vowel ");
        }
        else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')){
            System.out.println("is an VOWEL");
        }
        else{
            System.out.println("is an consonant");
        }
    }
}