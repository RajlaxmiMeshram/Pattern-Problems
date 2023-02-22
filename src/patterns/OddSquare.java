/*
 * Write a program to print the pattern for the given N number of rows.
For N = 4

1357
3571
5713
7135

 */

package patterns;

import java.util.Scanner;

public class OddSquare {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        int maxOdd = 1+(n-1)*2;
	        int oddCount =0;
	        while(i<=n){
	            int j =1;
	            int odd=1;
	            odd=odd+oddCount;
	            while(j<=n){
	                
	                if(odd>maxOdd){
	                     odd=1;
	                }
	                System.out.print(odd);
	                odd=odd+2;
	                j=j+1;
	               
	            }
	            System.out.println();
	            i=i+1;
	            oddCount= oddCount+2;

	}

}
}
