//Write a C program to input week number and print week day
import java.util.*;
public class Week{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a week number");
        int weak = s.nextInt();
        if(weak>0){
            if(weak==1){
                System.out.println("Monday");
            }
            else if(weak==2){
                System.out.println("tuesday");
            }
            else if(weak==3){
                System.out.println("wednesday");
            }
            else if(weak==4){
                System.out.println("thursday");
            }
            else if(weak==5){
                System.out.println("friday");
            }
            else if(weak==6){
                System.out.println("saturday");
            }
            else if(weak==7){
                System.out.println("sunday");
            }
        }
    }
}