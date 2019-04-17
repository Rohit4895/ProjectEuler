package Solutions;

public class Solution_6 {

	public static void main(String[] args) {
		/*Question:- 
		 * The sum of the squares of the first ten natural numbers is,
		 * 
		 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
		 * numbers is,
		 * 
		 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
		 * squares of the first ten natural numbers and the square of the sum is 3025 −
		 * 385 = 2640.
		 * 
		 * Find the difference between the sum of the squares of the first one hundred
		 * natural numbers and the square of the sum.
		 */
		int sumOfSquare=0, squareOfSum=0, sumOfNumbers=0;
		for(int i=1; i<=100; i++) {
			sumOfSquare+=(i*i);
			sumOfNumbers+=i;
		}
		squareOfSum = sumOfNumbers*sumOfNumbers;
		
		System.out.println("the difference between the sum of the squares of the first one hundred\n" + 
				"natural numbers and the square of the sum is : "+(squareOfSum-sumOfSquare));

	}

}
