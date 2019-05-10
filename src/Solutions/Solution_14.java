package Solutions;

import java.util.Scanner;

public class Solution_14 {
	
	private static Scanner scanner = new Scanner(System.in);
	private static int numberOfInputs;
	private static int inputs[] ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_14 sol = new Solution_14();
		
		sol.takeNumberOfInputs();
		sol.takeInputs();
		
		int prevCount=0, currentCount=0, collatzNum=0, newValue=0;
		
		for(int value: inputs) {
			for(int i=value; i>1; i--) {
				newValue = i;
				while(newValue != 1) {
					
					if(newValue%2 == 0) {
						newValue/=2;
						currentCount++;
					}else {
						newValue = (3*newValue)+1;
						currentCount++;
					}
					
				}

				if(i == value) {
					prevCount = currentCount;
					collatzNum = i;
				}
				
				if(currentCount > prevCount) {
					System.out.println("i: "+i);
					prevCount = currentCount;
					collatzNum = i;
					currentCount=0;
					break;
				}
				currentCount=0;
			}
			System.out.println(collatzNum);
		}
		

	}
	
	private void takeNumberOfInputs() {
		numberOfInputs = scanner.nextInt();
		if (numberOfInputs < 1 || numberOfInputs > Math.pow(10, 4)) {
			return;
		}
	}
	
	private void takeInputs() {
      inputs = new int[numberOfInputs];
		
		for(int i=0; i<numberOfInputs; i++) {
			inputs[i] = scanner.nextInt();
			
			if (inputs[i] < 1 || inputs[i] > (5*Math.pow(10, 6))) {
				return;
			}
		}
	}

}
