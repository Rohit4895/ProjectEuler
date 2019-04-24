package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_9 {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * long c=0; for(int i=50; i<=500; i++) { for(int j=50; j<=500; j++) { if(i<j) {
	 * c = (i*i)+(j*j); double prev = Math.sqrt(c); double next = Math.floor(prev);
	 * if(prev == next) { if((i+j+prev)==1000) System.out.println((int)(i*j*prev));
	 * } } } }
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfInputs = in.nextInt();
        List<Integer> input = new ArrayList<Integer>();
        for(int i = 0; i < numberOfInputs; i++){
            input.add(in.nextInt());
        }

        for(int value : input){
            boolean isFind = false;
            long c=0;
        for(int i=1; i<=(value/2); i++) {
            for(int j=1; j<=(value/2); j++) {
                if(i<j) {
                    c = (i*i)+(j*j);
                    double prev = Math.sqrt(c);
                    double next = Math.floor(prev);
                    if(prev == next) {
                        if((i+j+prev)==value){
                            System.out.println((int)(i*j*prev));
                            isFind = true;
                            break;
                            }
                    }
                }
            }
            if(isFind)
            break;
        }
        if(!isFind){
            System.out.println(-1);
        }
        }
    }
	


}
