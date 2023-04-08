package 章节检测;
import java.util.Scanner;
//实现判断一个整数，属于哪个范围：
//大于0；小于0；等于0
//思路：使用if--else if--else即可

public class Homework2 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入一个整数:");
	int x=myScanner.nextInt();
	if(x==0){
		System.out.println("这个数等于0");
	}
	else if(x<0){
		System.out.println("这个数小于0");
	}
	else{
		System.out.println("这个数大于0");
	}
}
}
