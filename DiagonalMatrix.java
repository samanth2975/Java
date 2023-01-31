package twoDarray;

import java.util.Scanner;

public class DiagonalMatrix {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[][] = new int [3][3];
		int i,j;
		System.out.println("DiagonalMatrix is : ");
		for (i=0;i<3;i++)
		{
			for (j=0;j<3;j++)
			{
				if(i==j)
					a[i][j]=1;
				else 
					a[i][j]=0;
				System.out.print(a[i][j]+" ");
				}
			System.out.println();
			
		}
		
	}

}
