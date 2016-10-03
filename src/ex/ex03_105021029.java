package ex;

/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;

public class ex03_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字元:");
		char a = scn.next().charAt(0);
		int b = a - 'A';
		if (b >= 0 && b <= 26) {
			b = b + 'a';			
			System.out.println((char)b);
		} else if (b >= 27 && b <= 53) {
			b = b + ('a'-'A'+1);
			System.out.println((char)b);
		}else if (b < 0 || b > 53) {
			b = b + ('a'-'A');
			System.out.println("輸入錯誤");
		} 

	}

}
