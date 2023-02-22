/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 */

package patterns;

import java.util.Scanner;

public class AlphaPattern {

	public static void main(String[] args) {
		int n ;
        Scanner s =new Scanner(System .in);
        n = s.nextInt();
        int i =0;
        while( i<=n-1)
        {
            int j =0;
            while(j<=i)
            {
                System.out.print((char)('A'+i));
                j++;
            }
System.out.println();
i++;

	}

	}
}
