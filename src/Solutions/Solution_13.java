package Solutions;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	       int numberOfInputs = scan.nextInt();
	       
	       BigInteger arr[] = new BigInteger[numberOfInputs];

	       BigInteger result = BigInteger.ZERO;

	       for(int i=0; i<numberOfInputs; i++){
	           arr[i] = scan.nextBigInteger();
	           result = result.add(arr[i]);
	       }

	       String finalResult = String.valueOf(result);
	       System.out.println(finalResult.substring(0,10));

	}

}
