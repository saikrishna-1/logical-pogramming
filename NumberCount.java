//12. Write a java program to count total number of notes in given amount.
import java.util.*;


	public class NumberCount {

	public static void main(String[] args) {

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a Amount");
		int amt=s.nextInt();
		
		if(amt%100==0) {
			if(amt%2000==0||amt%2000!=0) {
				int a=(amt/2000);
				amt=amt-(a*2000);
				System.out.println("Number of 2000's is :"+a);
			}
		 if(amt%500==0||amt%500!=0) {
				int a=(amt/500);
				amt=amt-(a*500);
				System.out.println("Number of 500's is :"+a);
			}
			 if(amt%200==0||amt%200!=0) {
				int a=(amt/200);
				amt=amt-(a*200);
				System.out.println("Number of 200's is :"+a);
			}
			 if(amt%100==0&&amt!=0) {
				int a=(amt/100);
				
				System.out.println("Number of 100's is :"+a);
			}
		}
		
		else {
			System.out.println("enter valid amount");
		}
	}
}