package day6_assignment_logical;

public class Perfect_number {

	public static void main(String[] args) {
		int n=28,sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
			sum=sum+i;
		}
			if(sum==n) {
				System.out.println("The number is a perfect number");
				
			}
			else {
				System.out.println("The number is not a perfect number");
			
		}
	}
	}


