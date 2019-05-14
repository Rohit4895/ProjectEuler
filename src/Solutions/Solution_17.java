package Solutions;

import java.util.Scanner;

public class Solution_17 {
	private static String result;
	
	private static String one[] = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	private static String ten[] = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };


	public void pw(int n, String ch)
	{
		
		if (n > 19)
		{
			
			result+=(ten[n / 10] + " " + one[n % 10]+" ");
		}
		else
		{
			
			result+=one[n]+" ";
		}
		if (n > 0) {
			
			result+=ch+" ";
		}
	}
 
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		int numberOfInputs = scanner.nextInt();
		if(numberOfInputs > 10 || numberOfInputs < 1) {
			return;
		}
		
		int inputs[] = new int[numberOfInputs];
		for(int i=0; i<numberOfInputs; i++) {
			inputs[i] = scanner.nextInt();
		}
		
		for(int n: inputs) {
		
			//System.out.println("len: "+String.valueOf(n).length());
			result="";
			Solution_17 a = new Solution_17();
			
			switch (String.valueOf(n).length()) {
			case 1:
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 2:
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 3:
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 4:
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 5:
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 6:
				a.pw(((n / 100000) % 100), "lakh");
				
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 7:
				a.pw(((n / 100000) % 100), "lakh");
				
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 8:
				a.pw((n / 10000000) % 100, "crore");
				
				a.pw(((n / 100000) % 100), "lakh");
				
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;
			case 9:
				a.pw((n / 10000000) % 100, "crore");
				
				a.pw(((n / 100000) % 100), "lakh");
				
				a.pw(((n / 1000) % 100), "thousand");
				
				a.pw(((n / 100) % 10), "hundred");
				
				a.pw((n % 100), "");
				System.out.println(result.trim());
				break;

			default:
				break;
			}
			
		}
	}

}
