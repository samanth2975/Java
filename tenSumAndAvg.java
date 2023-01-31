package oneDArray;

import java.util.Scanner;

public class tenSumAndAvg {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int a[] = new int [10];
	int i ,sum =0;
	double avg ;
	for (i=0;i<10;i++)
	{
		a[i] = s.nextInt();
		sum=sum+a[i];
	}
	avg=(double) sum/10;
	System.out.println("THE sum is :" + sum);
	System.out.println("Avg is : " + avg);
	}
	}


