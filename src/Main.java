import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		/*
		 * int[] arrayOne = { 0, 1, 2, 3, 4 }; int lenArrOne = arrayOne.length;
		 * 
		 * int[] arrayTwo = new int[lenArrOne];
		 * 
		 * for (int i = 0; i < arrayOne.length; i++) { arrayTwo[i] =
		 * arrayOne[i]; }
		 * 
		 * System.out.println("ArrayOne is: " + Arrays.toString(arrayOne));
		 * System.out.println(); System.out.println("ArrayTwo is: " +
		 * Arrays.toString(arrayTwo));
		 */
		// int[i][j]
		/*int n = 100;

		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = n - 15;
				//System.out.println(matrix[i][j]);
				
				 System.out.print(matrix[i][j] + " ");
				n--;
			}
			System.out.println();
		}
		*/
		
		//Напишете програма,  която пълни двумерен масив с размер 4х4. Пълненето става хоризонтално.  Обходете повторно матрицата и умножете всички нечетни числа по 2, така че всички числа да станат четни или 0.
int n =100;
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = n - 15;
				//System.out.println(matrix[i][j]);
				
				 System.out.print(matrix[i][j] + " ");
				 n --;
				
			}
			System.out.println();
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if(matrix[i][j] %2 !=0){
					matrix[i][j] = matrix[i][j] *2;
				}
				System.out.print(matrix[i][j] + " ");
			
				
			}
			System.out.println();
		}

	}

}