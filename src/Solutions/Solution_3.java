package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution_3 {
	public static void main(String args[]) {
		/*
		 * The prime factors of 13195 are 5, 7, 13 and 29.
		 * 
		 * What is the largest prime factor of the number 600851475143 ?
		 */

		long num = 24;
		List<Long> resultArr = new ArrayList<Long>();
		int j=0;
		System.out.println("num: "+num);
		
		for(long i=2; i<=num; i++) {
			if (num%i == 0) {
				resultArr.add(i);
				j++;
				num = num/i;
			}
		}
		
		
		int m = resultArr.size()-1;
		long result = resultArr.get(m);
		for(long k=2; k<=(result/2); k++) {
			if(result%k==0) {
				m--;
				result = resultArr.get(m);
			}
		}
		System.out.println("largest prime factor: "+result);
		
	}

}
