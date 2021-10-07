//Write a C program to print multiplication table of any number.
import java.util.*;
public class Multiply{
    public static void main(String args[]){
        int n=10;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the muplcation value");
        int m = s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(m+"*"+i+"="+ m*i);
        }
    }
}