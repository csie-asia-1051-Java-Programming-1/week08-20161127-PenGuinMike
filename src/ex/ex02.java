package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入資料與數字型態和想要轉換的數字型態(256,10):");
		int val1=scn.nextInt();
		int val2=scn.nextInt();
		int val3=scn.nextInt();
		fun1(val1,val2);
	}
	public static int fun1(int val1,int val2){
		String str = val1.toString();
		int sum=0;
		int data[]=new int[str.length()];
		char data1[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			data1[i]*=Math.pow(10, i);
			sum+=data[i];
			System.out.println(sum);
		}System.out.println(sum);
		return sum;
	}
	public static void fun2(int val1,int val2){
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
