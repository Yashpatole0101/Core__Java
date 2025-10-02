package Array;

public class Matrix_multiplication {

	public static void main(String[] args) {
		
		        // First 2x2 matrix
		        int[][] A = {
		            {1, 2},
		            {3, 4}
		        };

		        // Second 2x2 matrix
		        int[][] B = {
		            {5, 6},
		            {7, 8}
		        };

		        // Resultant 2x2 matrix
		        int[][] result = new int[2][2];

		        // Matrix multiplication logic....
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                result[i][j] = 0;  // initialize cell
		                for (int k = 0; k < 2; k++) {
		                    result[i][j] += A[i][k] * B[k][j];
		                }
		            }
		        }

		        // Print result
		        System.out.println("Result of 2x2 Matrix Multiplication:");
		        for (int i = 0; i < 2; i++) {
		            for (int j = 0; j < 2; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println(); // new line after each row
		        }
		    }
		}
	


