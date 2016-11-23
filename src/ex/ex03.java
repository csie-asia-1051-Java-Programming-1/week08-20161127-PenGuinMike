package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，
	其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 104021074 楊永聖
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		/*int data1[][]={{1,2},
					   {3,4},
					   {5,6}};
		int data2[][]={{4,5,6},
					   {7,8,9}};
		int a = data1.length;
		int b = data2[1].length;
		int c = data1[0].length;
		int d = data2.length;
		int data3[][]=new int[a][b];//System.out.println(a+""+b+""+c+""+d);*/
		System.out.println("請輸入n1,m1,n2,m2: ");
		int n1 = scn.nextInt();//輸入矩陣規格
		int m1 = scn.nextInt();
		int n2 = scn.nextInt();
		int m2 = scn.nextInt();
		int data1[][]=new int[m1][n1];//訂製矩陣
		int data2[][]=new int[n2][m2];
		int data3[][]=new int[m1][m2];
		int a = data1.length;//計算矩陣長度
		int b = data2.length;
		int c = data1[0].length;
		int d = data2[0].length;
		//int e = data1[1].length;
		//int f = data2[1].length;
		System.out.println(a+""+b+""+c+""+d);
		System.out.println("請輸入全部的資料(A矩陣):");
		for(int i=0;i<m1;i++){//key資料
			for(int j=0;j<n1;j++){
				//System.out.println("請輸入第"+"["+i+"]"+"["+j+"]的資料: ");
				data1[i][j]=scn.nextInt();
			}
		}
		System.out.println("請輸入全部的資料(B矩陣):");
		for(int i=0;i<n2;i++){//key資料
			for(int j=0;j<m2;j++){
				//System.out.println("請輸入第"+"["+i+"]"+"["+j+"]的資料: ");
				data2[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				for(int k=0;k<d;k++){
					//System.out.println("data3= "+data3[i][k]+" data1= "+data1[k][j]+" data2= "+data2[j][k]);
					data3[i][k]+=data1[i][j]*data2[j][k];//運算中
				}
			}
		}
		for(int i=0;i<d;i++){
			for(int j=0;j<d;j++){//印出
				//System.out.println(data1[i][j]);
				System.out.print(data3[i][j]+" ");
			}System.out.println();
		}
	}

}
