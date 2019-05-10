package Solutions;

import java.util.Scanner;

public class Solution_16 {


    private static Scanner scanner = new Scanner(System.in);
    private static int numberOfInputs;
    private static int inputs[] ;


    public static void main(String[] args) {
       
        Solution_16 sol = new Solution_16();
        
        sol.takeNumberOfInputs();
        sol.takeInputs();
        int result=0, additionOfResult;
        
        for(int i=0; i<numberOfInputs; i++) {
            result = (int) Math.pow(2, inputs[i]);
            additionOfResult=0;
            while (result != 0) {
                additionOfResult += result%10;
                result/=10;
            }
            System.out.println(additionOfResult);
        }
    }

    private void takeNumberOfInputs() {
        numberOfInputs = scanner.nextInt();
        if (numberOfInputs < 1 || numberOfInputs > Math.pow(10, 2)) {
            return;
        }
    }
    
    private void takeInputs() {
      inputs = new int[numberOfInputs];
        
        for(int i=0; i<numberOfInputs; i++) {
            inputs[i] = scanner.nextInt();
            
            if (inputs[i] < 1 || inputs[i] > Math.pow(10, 4)) {
                return;
            }
        }
    }
}

