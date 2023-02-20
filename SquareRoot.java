package day6_assignment_logical;
import java.util.*;

public class SquareRoot {

	public static void main(String[] args) {
		try {
			Scanner s = new Scanner(System.in);
			System.out.println("enter no to find square root");
			double c = s.nextDouble();
			System.out.println("square root is " + Util.sqrt(c));
			s.close();
		} catch (Exception e) {
			System.out.println("inter integer value "+e.getMessage());
		}

	}

	}

