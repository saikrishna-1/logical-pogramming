//Write a C program to print all Prime numbers between 1 to n.
import java.util.*;
public class AllPrime{
    public static void main(String args[]){
        
        int i;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        int count;
        for( i=1;i<=n;i++){
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    break;
                }
            }
            if(count==0&&i!=1){
            System.out.println(i+" ");
        }
        }
        
    }
}