package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val1 = scn.nextInt();
		
		//System.out.println("b="+b);
		fun1(val1);
	}
	public static void fun1(int val1){
		int x = 0;
		int b=(int) Math.ceil(Math.log(val1)/Math.log(2));
		int data [] = new int[b];
		for(int i=b-1;i>=0;i--){
			data[i]=(val1%2);
			val1/=2;
		}
		for(int i=0;i<b;i++){
			System.out.print(data[i]);
		}

	}

}
