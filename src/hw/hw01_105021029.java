package hw;

import java.util.Scanner;

public class hw01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個正整數值(不含 0):");
		long x = scn.nextLong();
		long n = 0;
		while (x > 0) {
			n++;
			x = x / 10;
		}
		System.out.println("這是" + n + "位數");

	}

}
