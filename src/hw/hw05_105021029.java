package hw;

import java.util.Scanner;

public class hw05_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數n:");
		int x = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= x; i++) {
			sum += i * (i + 1);
		}
		System.out.println("1*(1+1) + 2*(2+1) + 3*(3+1) + … + n*(n+1)為:" + sum);

	}

}
