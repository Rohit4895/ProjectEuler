package Solutions;

import java.util.Scanner;

public class Solution_11 {

	public static void main(String[] args) {
		int gridHorLength = 20, gridVerLength = 20;
		int adjacentNum = 4;
		Scanner in = new Scanner(System.in);
		int[][] grid = new int[gridVerLength][gridHorLength];
		for (int i = 0; i < gridVerLength; i++) {
			for (int j = 0; j < gridHorLength; j++) {
				grid[i][j] = in.nextInt();
			}
		}

		long result = 1, product = 1;
		for (int i = 0; i < (gridVerLength - (adjacentNum - 1)); i++) {
			for (int j = 0; j < (gridHorLength - (adjacentNum - 1)); j++) {
				result = Math.max(result, grid[i][j] * grid[i][j + 1] * grid[i][j + 2] * grid[i][j + 3]);
				result = Math.max(result, grid[i][j] * grid[i + 1][j] * grid[i + 2][j] * grid[i + 3][j]);
				result = Math.max(result, grid[i][j] * grid[i + 1][j + 1] * grid[i + 2][j + 2] * grid[i + 3][j + 3]);
				if (i >= 3 && j >= 3) {
					result = Math.max(result,
							grid[i][j] * grid[i - 1][j - 1] * grid[i - 2][j - 2] * grid[i - 3][j - 3]);
				}
			}

		}

		System.out.println(result);
	}

}
