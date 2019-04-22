package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Solution_7 {
	public static void main(String args[]) {
		
		/*
		 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
		 * that the 6th prime is 13.
		 * 
		 * What is the 10 001st prime number?
		 */
		
		int count = 0, n=2, result=0;
		boolean prime = true;
		
		while (count < 10001) {
			
			for(int i=1; i<=(n/2); i++) {
				if (i!=1) {
					if(n%i == 0)
						prime=false;
				}
			}
			if(prime) {
				count++;
				result=n;
			}
			prime=true;
			n++;
		}
		
		System.out.println("10001 st prime number is: "+result);
	}

}
