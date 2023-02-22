/*
 * Write a program to print triangle of user defined integers sum.
 * 
 * Sample Input 1 : 5

Sample Output 1 :
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15

 */


package patterns;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		int i=1;

		int sum=i;    

		  while(i<=n){

		int t=1;    //starting number    

		  int j=1;

		while(j<=i){                    

		         if(t<i){

		System.out.print(t+"+");            

		   t++;                                          

		   j++;

		 }              

		else{            

		       System.out.print(t+"="+sum);            

		        j++;
		                      }
		          }        

		   System.out.println();    

		      i++;      

		     sum=sum+i;

		        }

	}

}
