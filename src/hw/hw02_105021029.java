package hw;

import java.util.Scanner;
public class hw02_105021029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;
		char cc ;
		while(true){
			System.out.println("請輸入一個數:");
			int v1 = scn.nextInt();
			if(v1>0){
				a++;
			}else if(v1<0){
				b++;
			}else if(v1==0){
				c++;
			}
			System.out.println("還要繼續輸入嗎?y/n");
			cc = scn.next().charAt(0);
			if(cc == 'n' || cc == 'N'){

				System.out.println("正數"+a+"個"+"\n"+"負數"+b+"個"+"\n"+"零"+c+"個");
				break;

			}


		}

	}

}
