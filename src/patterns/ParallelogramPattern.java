/*
 * Write a program to print parallelogram pattern for the given N number of rows.
For N = 4

****
 ****
  ****
   ****

 * 
 */

package patterns;

import java.util.Scanner;

public class ParallelogramPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	        
	     int cr=1;
	    while(cr<=n)
	    {
	        int sp=1;
	        while(sp<=cr-1)
	        {
	           System.out.print(" ");
	            sp+=1;
	            
	        }
	        int cc=1;
	        while(cc<=n)
	        {
	            System.out.print("*");
	            cc+=1;
	            
	        }
	        System.out.println();
	        cr+=1;
	    }

	}

}
