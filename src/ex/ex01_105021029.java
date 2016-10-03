package ex;

/*
 * Topic: 輸入一個字串，並把它反向輸出。
 * Date: 2016/10/03
 * Author: 105021029 汪元浩
 */
import java.lang.StringBuilder;
import java.sql.Date;
import java.util.Scanner;

import javafx.scene.chart.PieChart.Data;

public class ex01_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字串:");
		String str = scn.nextLine();
		StringBuilder stri = new StringBuilder(str);
		System.out.print(stri.reverse().toString());

		// char []data = str.toCharArray();
		//
		// for(int i = data.length-1; i > -1; i--){
		// System.out.print(data[i]);
		//
		// }

	}

}
