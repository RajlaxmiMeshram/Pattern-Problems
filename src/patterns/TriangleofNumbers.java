/*
 * Print the following pattern for the given number of rows.
Pattern for N = 4

...1
..232
.34543
4567654

The dots represent spaces.
 * 
 */

package patterns;

import java.util.Scanner;

public class TriangleofNumbers {

	public static void main(String[] args) {
		int i, j, n, count = 0, count1 = 0, k = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for(i = 1; i <= n; ++i)
		{
		for(j = 1; j <= n-i; ++j)
		{
		System.out.print(" ");
		++count;
		}

		while(k != 2*i-1)
		{
		if (count <= n-1)
		{
		System.out.print(i+k );
		++count;
		}
		else
		{
		++count1;
		System.out.print((i+k-2*count1) );
		}
		++k;
		}
		count1 = count = k = 0;

		System.out.println();
		}

	}

}
