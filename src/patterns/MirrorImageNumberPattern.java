/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
The dots represent spaces.



The dots represent spaces.*/
package patterns;

import java.util.Scanner;

public class MirrorImageNumberPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System .in);

        int n = sc.nextInt();
        int i = 1;
        while (i<=n)
        {
int j=1;
while(j<=n-i)
{
    System.out.print(" ");
    j++;
}
j=1;
while(j<=i)
{
    System.out.print(+j);
    j++;
}
System.out.println();
i++;

	}

}
}
