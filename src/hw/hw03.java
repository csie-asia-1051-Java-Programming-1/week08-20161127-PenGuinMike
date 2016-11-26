package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		System.out.println(fun1(a));
		long x = fun1(a);
		String str = Long.toString(x);
		int count =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='1'){
				count++;
			}
		}System.out.println(count);
		
	}
	public static long fun1(int a){
		if(a>1){
			return fun1(a/2)*10+a%2;
		}else{
			return a%2;
		}
	}

}
