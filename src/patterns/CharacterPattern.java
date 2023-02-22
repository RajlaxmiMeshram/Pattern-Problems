/*
 * Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
 */

package patterns;

import java.util.Scanner;

public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);

        int n = sc.nextInt();
        int i = 1;

        while (i<=n)
        {
            int j = 0;
            char startchar=(char)('A'+i -1);
            while(j<=i-1)
            {
                System.out.print(startchar);
                startchar++;
                //startchar = (char)(startchar+1);
                j++;
            }

            System.out.println();
            i++;
        }

	}

}
