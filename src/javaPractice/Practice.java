package javaPractice;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	      int n = 0;
	      int k = 5;
	      int i = 0;
	      int j = -1;
	      int s = 1;

	      int[][] arr = new int[5][5];

	      while (true) {
	         for (int p = 0; p < k; p++) {
	            n = n + 1;
	            j = j + s;
	            arr[i][j] = n;
	         }

	         k = k - 1;
	         if (k < 0)
	            break;

	         for (int p = 0; p < k; p++) {
	            n = n + 1;
	            i = i + s;
	            arr[i][j] = n;
	         }

	         s = s * -1;

	      }

	      for (int a = 0; a < arr.length; a++) {
	         for (int b = 0; b < arr[a].length; b++) {
	            System.out.print(arr[a][b] + " ");
	         }
	         System.out.println();
	      }
	   }

	

}
