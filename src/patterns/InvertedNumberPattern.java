/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
333
22
1
 */

package patterns;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);

        int n = sc.nextInt();
        int i = 1;
        while (i<=n)
        {
int j=n-i+1;
int num =j;
while(j>0)
{
    System.out.print(num);
  
    j--;
}

System.out.println();
i++;

        }

	}

}
