/*
***** 
***** 
***** 
***** 
***** 
*/
import java.util.Scanner;

class Pattern1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row=1; row<=n; row++){
			for(int col=1; col<=n; col++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

/*Output:
C:\Users\Saurabh\Desktop\CDAC\Assignment 3\Section 3\Star-Number patterns>java Pattern1
5
*****
*****
*****
*****
*****
*/