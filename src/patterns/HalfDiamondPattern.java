/*
 * Write a program to print N number of rows for Half Diamond pattern using stars and numbers
Note : There are no spaces between the characters in a single line.


 Input 1 : 3
 
 output 1:
 
 *
*1*
*121*
*12321*
*121*
*1*
*
 
 */

package patterns;

import java.util.Scanner;

public class HalfDiamondPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("*");
		for(int i=1; i<=n; i++)
		{
			System.out.print("*");
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=i-1; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.print("*");
			System.out.println();
			
		}

		for(int i=n-1;i>=1;i-- )
		{
		 System.out.print("*");
		 for(int j=1; j<=i; j++)
		 {
		     System.out.print(j);
		}
		 for(int j=i-1; j>=1; j--)
		 {
			 System.out.print(j);
		 }
		 System.out.print("*");
			System.out.println();
			}
		System.out.print("*");

	}

}
