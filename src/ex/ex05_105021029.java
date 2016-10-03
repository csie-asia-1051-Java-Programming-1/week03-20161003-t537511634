package ex;
/*
 * Topic: 輸入一正整數，判斷其奇偶數。
 * Date: 2016/10/03
 * Author: 105021029 汪元浩
 */
import java.util.Scanner;

public class ex05_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數:");
		int v1 = scn.nextInt();
		int a = v1%2;
		if(a == 1){
			System.out.println("其為奇數");

		}else if(a == 0){
			System.out.println("其為偶數");

		}
	}

}
