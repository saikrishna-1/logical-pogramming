
// 13. Write a java program to input marks of five subjects Physics, Chemistry, Biology,Mathematics and Computer. Calculate percentage and grade according to following:
//     Percentage >= 90% : Grade A
//     Percentage >= 80% : Grade B
//     Percentage >= 70% : Grade C
//     Percentage >= 60% : Grade D
//     Percentage >= 40% : Grade E
//     Percentage < 40%  : Grade F

	public class Alternate {

	public static void main(String[] args) {

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter marks for subjects:");
		System.out.println("Enter marks for Physics:");
		int physics=s.nextInt();
		System.out.println("Enter marks for Chemistry:");
		int chemistry=s.nextInt();
		System.out.println("Enter marks for MathMatics:");
		int maths=s.nextInt();
		System.out.println("Enter marks for Computer:");
		int computer=s.nextInt();
		System.out.println("Enter marks for Biology:");
		int biology=s.nextInt();
		
		
		int total=(phy+che+mat+com+bio);
		int per=(total*100)/500;
		System.out.println("total percentage is:"+per);

		if(per>40) {
		if(per>=90) {
			System.out.println("Grade is 'A'");
		}
		else if(per>=80) {
			System.out.println("Grade is 'B'");
			}
		else if(per>=70) {
			System.out.println("Grade is 'C'");
	     }
		else if(per>=60) {
			System.out.println("Grade is 'D'");
	     }
		else if(per>=40) {
			System.out.println("Grade is 'E'");
	      }
		}
		else  {
			System.out.println("Grade is 'F'");
	}
	
	}
}