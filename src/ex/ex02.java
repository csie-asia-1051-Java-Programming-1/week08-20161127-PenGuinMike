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
		System.out.println("請輸入資料與數字型態和想要轉換的數字型態(256,10,8):");
		int val1=scn.nextInt();
		int val2=scn.nextInt();
		int val3=scn.nextInt();
		int x =fun1(val1,val2);
		fun2(x,val3);
	}
	public static int fun1(int val1,int val2){
		String str = Integer.toString(val1);
		int sum=0;
		//char data1[]=str.toCharArray();
		int data0[] = new int[str.length()];
		for(int i=0;i<str.length();i++){
			data0[i]=val1%10;
			val1/=10;
			//System.out.println(data0[i]);
		}
		for(int i=str.length()-1;i>=0;i--){
			data0[i]*=Math.pow(val2, i);
			sum+=data0[i];
			//System.out.println("data1="+data0[i]);
		}//System.out.println(sum);
		return sum;
	}
	public static void fun2(int val1,int val3){
		int x = 0;
		int b=(int) Math.ceil(Math.log(val1)/Math.log(val3));
		int data [] = new int[b];
		for(int i=b-1;i>=0;i--){
			data[i]=(val1%val3);
			val1/=val3;
		}
		for(int i=0;i<b;i++){
			System.out.print(data[i]);
		}
	}
}
