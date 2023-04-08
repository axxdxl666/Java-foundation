package 章节检测;
import java.util.Scanner;

//判断一个年份是否为闰年
//闰年的条件是符合下面二者之一：
//(1)年份能被 4 整除，但不能被 100 整除；
//(2)能被 400整除

public class Homework3 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入年份:");
	int year=myScanner.nextInt();
	if((year%4==0&&year%100!=0)||year%400==0){
		 System.out.println(year + " 是 闰年");
	}
	else{
		 System.out.println(year + "  不是 闰年");
	}
}
}