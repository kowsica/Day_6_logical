package day6_assignment_logical;
import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,r;
		System.out.println("Enter a number that is needed to be reversed");
		n=sc.nextInt();
		 int reverse = 0 ;
		
		while(n!=0) {
			 r =n%10;
			
			 reverse= reverse*10 + r;
		      n=n/10;
		}
			
		
		System.out.print("The reverse of the number is:"+" "+ reverse);
		

		}
}
