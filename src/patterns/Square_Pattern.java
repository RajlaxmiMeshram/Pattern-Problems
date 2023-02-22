/*
 * Print the following pattern for the given N number of rows.
 * 
     Pattern for N = 4
     
          4444
          4444
		  4444
          4444
 */


package patterns;

import java.util.Scanner;

public class Square_Pattern {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for (int j=1; j<=n;j++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
		

	}

}
