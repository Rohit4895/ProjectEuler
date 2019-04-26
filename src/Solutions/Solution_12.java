package Solutions;

import java.util.Scanner;

public class Solution_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int numberOfInputs = scanner.nextInt();
		int divisorCount = 0, a = 0, naturalNum = 0;

		int inputsArr[] = new int[numberOfInputs];
		for (int i = 0; i < numberOfInputs; i++) {
			inputsArr[i] = scanner.nextInt();
		}

		for (int value : inputsArr) {
			while (true) {

                naturalNum++;
                divisorCount = 0;

				a = naturalNum + a;

				for (int i = 1; i < Math.sqrt(a); i++) {
					if (a % i == 0)
						divisorCount++;
					
					
				}
				divisorCount*=2;

				if (divisorCount > value) {
					System.out.println(a);
					naturalNum = 0;
					a = 0;
					divisorCount = 0;
					break;
				}

				

			}

		}


	}

}
