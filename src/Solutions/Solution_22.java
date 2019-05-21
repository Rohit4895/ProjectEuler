package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution_22 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String alphabets[] = {"","A","B","C","D","E","F","G","H","I","J","K",
				"L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		long numberOfNames = scanner.nextLong();
		ArrayList<String> nameArray = new ArrayList<String>();
		
		
		for(int i=0; i<numberOfNames; i++) {
			nameArray.add(scanner.next().toUpperCase());
		}
		
		Collections.sort(nameArray);
		
		int numberOfInputs = scanner.nextInt();
		
		for(int i=0; i<numberOfInputs; i++) {
			String input = scanner.next();
			
			String[] inputSplit = input.split("");
			int addition = 0;
			
			for(int j=0; j<inputSplit.length; j++) {
				addition+= Arrays.asList(alphabets).indexOf(inputSplit[j]);
			}
			
			int position = nameArray.indexOf(input)+1;
			
			System.out.println(addition*position);
		}

	}

}
