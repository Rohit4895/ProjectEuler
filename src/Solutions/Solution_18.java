package Solutions;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_18 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int numberOfTestCases = in.nextInt();
        for(int i=0;i<numberOfTestCases;i++)
            {
            int numberOfRowsInTriangle = in.nextInt();
            in.nextLine();
            ArrayList<String> list = new ArrayList<String>();
            for(int j=0;j<numberOfRowsInTriangle;j++)
                list.add(in.nextLine());
            
            int[][] triangleArray = getTriangleArray(list, list.size());
            System.out.println("length: "+triangleArray.length);
            for(int j=triangleArray.length-2;j>=0;j--)
                {
                for(int k=0;k<triangleArray[j].length && k+1<triangleArray[j].length;k++)
                    {
                	System.out.println(triangleArray[j + 1][k]+" <-----------> "+ triangleArray[j + 1][k + 1]+" <-----------> "+triangleArray[j][k]);
                	 System.out.println(j+"____________"+k);
                	triangleArray[j][k] += Math.max(triangleArray[j + 1][k], triangleArray[j + 1][k + 1]); 
                    System.out.println(triangleArray[j][k]);
                }
            }
            //printArray(triangleArray, list.size());
            System.out.println(triangleArray[0][0]);
        }
    }
    public static int[][] getTriangleArray(ArrayList<String> list, int size)
        {
        int[][] triangleArray = new int[size][size];
        for(int i=0;i<list.size();i++)
            {
            String currentList = list.get(i);
            String[] currentRow = currentList.split(" ");
            for(int j=0;j<currentRow.length;j++)
                {
                triangleArray[i][j] = Integer.valueOf(currentRow[j]);
            }
        }
        return triangleArray;
    }
   
}
