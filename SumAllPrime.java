//Write a C program to find sum of all prime numbers between 1 to n.
import java.util.*;
public class SumAllPrime{
    public static void main(String args[]){
        
        int i,sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the n value");
        int n = s.nextInt();
        int count;
        for( i=1;i<=n;i++){
            count=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    count++;
                    //sum=sum+i;
                    break;
                }
            }
            if(count==0&&i!=1){
            System.out.println(i+" ");
            sum=sum+i;
            
            
        }
        }
        System.out.println(sum+" ");
        
        
    }
}