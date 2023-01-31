package twoDarray;

import java.util.Scanner;
//2*2 matrix using 2D array
public class TwointotwoMatrix {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a[][] = new int [2][2];
		int i,j,k=0;
		for(i=0;i<2;i++)
		{
	    for(j=0;j<2;j++) 
	    {
			a[i][j] = S.nextInt();
			k++;
		}
	  }
		System.out.println("THE given matrix \n");
		for(i=0;i<2;i++)
		{
	    for(j=0;j<2;j++) 
	    {
	    	System.out.println(a[i][j]+ " ");
	    }
		    System.out.println();
		}
	}

}
