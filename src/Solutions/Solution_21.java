package Solutions;

import java.util.HashMap;
import java.util.Scanner;

public class Solution_21 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int numberOfTestCases = in.nextInt();
	        HashMap<Integer, Long> sumUnderN = new HashMap<Integer, Long>();
	        
	        long sum = 0;
	        for(int j=1;j<400;j++)
	            {
	            int a = j;  
	            long da = getSumOfProperDivisors(a); 
	            System.out.println("da: "+da);
	            long b = da; 
	            long db = getSumOfProperDivisors(b); 
	            System.out.println("db: "+db);
	            if(a!=b && a==db)
	                {
	                sum+=a;
	                sumUnderN.put(j, sum);
	            }
	            else sumUnderN.put(j, sum);
	            
	            System.out.println("Sum: "+sum+" key: "+j);
	        }
	        
	        for(int i=0;i<numberOfTestCases;i++)
	            {
	            int n = in.nextInt();
	            System.out.println(sumUnderN.get(n));
	        }
	    }
	    public static long getSumOfProperDivisors(long n)
	        {
	        if(n==0) return 0;
	        if(n==1) return 1;
	        
	        int maxD = (int)Math.sqrt(n);
	        long sum=1;
	        for(int i=2;i<=maxD;i++)
	            {
	            if(n%i==0)
	                {
	            	System.out.println("i: "+i);
	                sum += i;
				/*
				 * long d = n/i; if(d!=i) sum+=d;
				 */
	            }
	        }
	        return sum;
	    }

}
