/*
 * Print the following pattern
Pattern for N = 4
...*
..***
.*****
*******


The dots represent spaces.
 */

package patterns;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);
		 int rows = sc.nextInt();
		        int k = 0;
		        
		       for (int i = 1; i <= rows; ++i, k = 0) {
		      for (int space = 1; space <= rows - i; ++space) {
		        System.out.print("  ");
		      }

		      while ( k != 2 * i - 1) {
		        System.out.print("*");
		        ++k;
		      }

		      System.out.println();
		    }

	}

}
