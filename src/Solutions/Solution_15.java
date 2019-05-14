package Solutions;


import java.math.BigInteger;
import java.util.Scanner;

import javax.imageio.IIOException;

public class Solution_15 {
	
	
		public static BigInteger binomialCoefficient(int n, int k)
		{
			BigInteger numerator = BigInteger.ONE, denominator = BigInteger.ONE ;
			for(int i=1; i<= (n+k); i++) {
				numerator = numerator.multiply(new BigInteger(i+""));
			}
			
			System.out.println("numerator: "+numerator);
			
			for(long i=1; i<=n; i++) {

				denominator = denominator.multiply(new BigInteger(i+""));
			}
			
			for(int i=1; i<=k; i++) {

				denominator = denominator.multiply(new BigInteger(i+""));
			}
			
			System.out.println("denominator: "+denominator);

			return (numerator.divide(denominator));
		}
		
		public static void main (String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			int numberOfInputs = scanner.nextInt();
			if(numberOfInputs > Math.pow(10, 3) || numberOfInputs < 1) {
				
				return;
			}
			int n[] = new int[numberOfInputs];
		    int k[] = new int[numberOfInputs];
				
				for(int i=0; i<numberOfInputs; i++) {
					n[i] = scanner.nextInt();
					k[i] = scanner.nextInt();
					
					if((n[i] > 500 || n[i] < 1) || (k[i] > 500 || k[i] < 1)) {
						
						return;
					}
						
				}
				
				System.out.println("processing");
				for(int i=0; i<numberOfInputs; i++) {
					System.out.println(binomialCoefficient(n[i],k[i]));
				}
			
		}
		

}
