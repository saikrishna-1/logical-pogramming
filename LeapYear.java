//Write a C program to check whether a year is leap year or not.
import java.util.*;
public class LeapYear{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter the year value");
        double year = s.nextDouble();
        if((year%4==0||year%400==0)&&year%100!=0){
            System.out.println("year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}