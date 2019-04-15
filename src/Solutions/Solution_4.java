package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution_4 {

	public static void main(String[] args) {
		/*
		 * A palindromic number reads the same both ways. The largest palindrome made
		 * from the product of two 2-digit numbers is 9009 = 91 × 99.
		 * 
		 * Find the largest palindrome made from the product of two 3-digit numbers.
		 */
		List<Integer> palindrome = new ArrayList<Integer>();
		int result =0;
		for(int i=1; i<=999; i++) {
			for(int j=1; j<=999; j++) {
				int prod = i*j;
				int num = prod;
				String remainder="";
				while (num != 0) {
					remainder += (num % 10);
					num = num / 10;
				}
				if(remainder.equals(String.valueOf(prod)) && remainder.length() != 1) {
					if (Integer.parseInt(remainder) > result) {
						result = prod;
					}
					
				}
			}
		}
		System.out.println("the largest palindrome made from the product of two 3-digit numbers is: "+result);
		
		

	}

}
