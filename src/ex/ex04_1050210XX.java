package ex;
/*
 * Topic: 將一連串數字(每個數字為 0~9)輸入，計算其和。例如：輸入 12345，輸出為15 (1+2+3+4+5=15)
 * Date: 2016/10/03
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;
public class ex04_1050210XX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
String str=scn.next();
char[] data=str.toCharArray();
for (int i=0;i<data.length;i++){
	int sum=0;
	sum=sum+data[i];
	System.out.print(sum);
}
	}

}
