package day6_assignment_logical;
import java.util.*;

public class Primenumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number:");
	int a =sc.nextInt();
			if(a%2!=0 || a== 2) {
				System.out.println("The number"+a + "is a prime number");
			}
			else {
				System.out.println("The number"+a+ "is not a prime number");
			}
	}

}
