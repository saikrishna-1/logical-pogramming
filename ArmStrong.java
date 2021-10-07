//Write a C program to check whether a number is Armstrong number or not.
import java.util.*;
public class ArmStrong{
    public static void main(String args[]){
        int rem=0;
        int cube=0;
        Scanner s = new Scanner(System.in);
        System.out.println("entr the armstrong number");
        int n = s.nextInt();
        int temp=n;
        while(n!=0){
            rem=n%10;
            cube=cube+(rem*rem*rem);
            n=n/10;
        }
        if(temp==cube){
            System.out.println("numbr is armstrong");
        }
        else{
            System.out.println("number is not a armstrong");
        }
    }
}