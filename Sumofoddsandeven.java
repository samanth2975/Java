package oneDArray;

import java.util.Scanner;

public class Sumofoddsandeven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int [10];
		int i,esum=0,osum=0;
		for(i=0;i<10;i++)
		{
			a[i] = s.nextInt();
			if (a[i]%2==0)
			esum = esum+a[i];
	    else
			osum = osum+a[i];
		}
		System.out.println("even sum are :" + esum);
		System.out.println("odd sum are :" + osum);
			
		}
		
 	}


