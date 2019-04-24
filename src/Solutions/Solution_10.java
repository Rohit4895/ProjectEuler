package Solutions;

import java.util.Scanner;

public class Solution_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
		 * 
		 * Find the sum of all the primes below two million.
		 */
	       Scanner in = new Scanner(System.in);
           int numberOfInputs = in.nextInt();
           int arr[] = new int[numberOfInputs];
           for(int i = 0; i < numberOfInputs; i++){
              arr[i] = in.nextInt();
           }
         long result;
           boolean isPrime;
         for(int value : arr){
           result = 0;
           for(int i=2; i<=value; i++) {
               isPrime = true;
               
               for(int j=2; j<=(i/2); j++) {
                   if(i%j == 0){
                       isPrime = false;
                       break;
                   }
               }
               if(isPrime)
                   result+=i;
               
               
           }
           System.out.println(result);
           }
	}

}
