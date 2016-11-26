package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		computer cop = new computer();
		float a = scn.nextFloat();
		char b = scn.next().charAt(0);
		float c = 0;
		if(b=='+'||b=='-'||b=='*'||b=='/'){
			c=scn.nextFloat();
		}System.out.println(computer.fun1(a,b,c));
	}
	 

}
class computer{
	
	
	public static float fun1(float a,char b,float c){
		float x = 0;
		switch(b){
		case '+':
			x=a+c;
			break;
		case '-':
			x=a-c;
			break;
		case '*':
			x=a*c;
			break;
		case '/':
			x=a/c;
			break;
		case '^':
			x=(float) Math.pow(a, 2);
			break;
		case '3':
			x=(float) Math.pow(a, 3);
			break;
		case 'L':
			x=(float) Math.sqrt(a);
			break;
		
		
		}
		
		return x;
	}
}