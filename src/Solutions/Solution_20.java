package Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numberOfInputs = scanner.nextInt();
		
		for(int i=0; i<numberOfInputs; i++) {
			int input = scanner.nextInt();
			BigInteger result=BigInteger.ONE, finalSum=BigInteger.ZERO;
			for(int j=input; j>=2; j--) {
				result = result.multiply(BigInteger.valueOf(j));
			}
			
			while(!result.equals(BigInteger.ZERO)) {
				
				finalSum = finalSum.add(BigInteger.valueOf((result.mod(BigInteger.TEN)).longValue()));
				
				result = result.divide(BigInteger.TEN);
			}
			
			System.out.println(finalSum);
		}

	}

}
