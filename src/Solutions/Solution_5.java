package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution_5 {

	public static void main(String[] args) {
		/*
		 * 2520 is the smallest number that can be divided by each of the numbers from 1
		 * to 10 without any remainder.
		 * 
		 * What is the smallest positive number that is evenly divisible by all of the
		 * numbers from 1 to 20?
		 */
		long lcm = 20, mul=2, result = lcm*mul ;
		int count=0;

		while (true) {
			
		for(int i=2; i<=20; i++) {
			if((result%i) == 0 )
				count++;
		}
		
			if(count == (lcm-1)) {
			System.out.println("final: "+result);
			break;
			}else {
			mul++;
			result = lcm*mul;
			count=0;
			}
		}
	}

}
