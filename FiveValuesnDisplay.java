package oneDArray;

import java.util.Scanner;

public class FiveValuesnDisplay
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		int a[] = new int [5];
		int i;
		for (i=0;i<5;i++)
		{
			a[i] = s.nextInt();
			
		}
		System.out.println("The entered elements are");
		for (i=0;i<5;i++)
		{
			System.out.print(" " +a[i]);
		}
	}

}
