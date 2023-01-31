package oneDArray;

import java.util.Scanner;

public class fivevaluesDisRev {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int [5];
		int i;
		for (i=0;i<5;i++)
		{
			a[i] = s.nextInt();
		}
		System.out.println("the reverse of arrray elements are" +i);
		for (i=4;i<=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
