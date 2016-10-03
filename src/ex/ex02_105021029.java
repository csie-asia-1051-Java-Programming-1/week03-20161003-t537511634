package ex;

/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 105021029 汪元浩
 */

import java.util.Scanner;

public class ex02_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元:");
		char a = scn.next().charAt(0);
		int b = a - 'a';
		if (b <= 0) {
			System.out.println("這是大寫");
		} else if (b >= 0) {
			System.out.println("這是小寫");
		}

	}

}
