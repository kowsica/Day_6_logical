package day6_assignment_logical;

public class Fibanocci {

	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=15;
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}
	}

}
