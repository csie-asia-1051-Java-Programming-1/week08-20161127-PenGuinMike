package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String x = scn.nextLine();
		//String a = Integer.toString(x);
		System.out.println(x+" ");
		number.fun1(x);
	}

}

class number{
	
	public static void fun1(String x){
		for(int i=0;i<5;i++){
			for(int j=0;j<x.length();j++){
				switch(x.charAt(j)){
				case '0':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print(" *   * ");
					}else if(i==2){
						System.out.print(" *   * ");
					}else if(i==3){
						System.out.print(" *   * ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '1':
					if(i==0){
						System.out.print("  *  ");
					}else if(i==1){
						System.out.print("  *  ");
					}else if(i==2){
						System.out.print("  *  ");
					}else if(i==3){
						System.out.print("  *  ");
					}else if(i==4){
						System.out.print("  *  ");
					}break;
				case '2':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print("     * ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print(" *     ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '3':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print("     * ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print("     * ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '4':
					if(i==0){
						System.out.print(" *   * ");
					}else if(i==1){
						System.out.print(" *   * ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print("     * ");
					}else if(i==4){
						System.out.print("     * ");
					}break;
				case '5':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print(" *     ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print("     * ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '6':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print(" *     ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print(" *   * ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '7':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print("     * ");
					}else if(i==2){
						System.out.print("     * ");
					}else if(i==3){
						System.out.print("     * ");
					}else if(i==4){
						System.out.print("     * ");
					}break;
				case '8':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print(" *   * ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print(" *   * ");
					}else if(i==4){
						System.out.print(" ***** ");
					}break;
				case '9':
					if(i==0){
						System.out.print(" ***** ");
					}else if(i==1){
						System.out.print(" *   * ");
					}else if(i==2){
						System.out.print(" ***** ");
					}else if(i==3){
						System.out.print("     * ");
					}else if(i==4){
						System.out.print("     * ");
					}break;
				
				
				
				
				
				
				}
			}System.out.println();
		}
		
	}
	
	
	
}
