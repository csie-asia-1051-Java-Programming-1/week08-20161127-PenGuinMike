package hw;
/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println(fun(a));
	}
	public static long fun(int a){
		if(a>1){
			return fun(a/2)*10+a%2;
		}else{
			return a%2;
		}

	}

}
