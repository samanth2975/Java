package oneDArray;

import java.util.Scanner;

public class ValueOfArrayandBiggestelementinArray {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int a[] = new int [5];
		int i,big;
		for(i=0;i<5;i++)
		{
			a[i] = S.nextInt();
		}
		big=a[0];
		for(i=1;i<5;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
			
			}
			
         System.out.println("Biggest element in the array : " + big);
		}
		
	}


