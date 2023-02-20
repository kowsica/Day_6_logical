package day6_assignment_logical;

public class Coupon {

	public static void main(String[] args) {
		
				char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
				int max=1000000;
				int a=(int) (Math.random()*max);	
				StringBuffer sb=new StringBuffer();
				
				while (a>0)
				{
					sb.append(chars[a % chars.length]);
					a /= chars.length;
				}

				String couponCode=sb.toString();
				System.out.println("Coupon Code: "+couponCode);	
			}
		
	}


