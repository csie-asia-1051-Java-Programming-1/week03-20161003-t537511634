package hw;

import java.util.Scanner;

public class hw04_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數n:");
		int x = scn.nextInt();
		int sum = 1;
		int i = 1;
		while (i <= x) {
			sum = sum * i;
			i++;
		}
		System.out.println("n!為:" + sum);
	}

}
