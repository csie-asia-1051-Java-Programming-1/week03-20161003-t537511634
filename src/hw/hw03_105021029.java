package hw;

import java.util.Scanner;

public class hw03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數n:");
		int x = scn.nextInt();
		int sum = 1;
		for (int i = 1; i <= x; i++) {
			sum = i * sum;
		}
		System.out.println("n!為:" + sum);

	}

}
