/*
    * 
   *** 
  ***** 
 ******* 
********* 

*/

import java.util.Scanner;

class Pattern5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //5
		int x=0;
		System.out.println(" ");
		
		for(int row=1; row<=n; row++){
			for(int col=n-1; col>=row; col--){
				System.out.print(" ");
			}
			
			for(int col=1; col<=row+x; col++){
				System.out.print("*");
			}
			
			x++;
			System.out.println(" ");
		}
	}
}
/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern5
5

    *
   ***
  *****
 *******
*********

*/