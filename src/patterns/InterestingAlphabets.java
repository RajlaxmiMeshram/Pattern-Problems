/*
 * Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
 */

package patterns;

import java.util.Scanner;

public class InterestingAlphabets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);

        int n = sc.nextInt();
        int i = 1;
int num =n;
        
        
        while (i<=n)
        {
            int j = 1;
            int startchar= 'A'+ num -1;
            
            while(j<=i)
            {
                
                System.out.print(((char)startchar));
                j++;
                startchar++;
                
                //startchar = (char)(startchar+1);
               
            }
           
            System.out.println();
            num--;
            i++;
            
        }
	}

}
