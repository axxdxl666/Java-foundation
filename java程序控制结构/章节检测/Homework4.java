package 章节检测;
import java.util.Scanner;

//判断一个整数是否是水仙花数
//所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
//例如：153=1*1*1+3*3*3+5*5*5

public class Homework4 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入一个三位数:");
	int num=myScanner.nextInt();
	int onesplace=num%10;//num%100%10也可以
	int tensplace=num%100/10;
	int hundredsplace=num/100;
	if(num==(onesplace*onesplace*onesplace)+(tensplace*tensplace*tensplace)+(hundredsplace*hundredsplace*hundredsplace)){
		System.out.println("这个数是水仙花数");
	}
	else{
		System.out.println("这个数不是水仙花数");
	}
}
}
