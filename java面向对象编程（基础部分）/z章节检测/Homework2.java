package z章节检测;
import java.util.Scanner;
//编写类B， 定义方法find， 实现查找某字符串是否在字符串数组中，并返回索引如果找不到，返回-1

public class Homework2 {
public static void main(String[]args){
	
	
	String[] arr={"小李","小王","小林"};
	B b=new B();
	int x=b.find(arr);
	System.out.println("返回索引="+x);
}
}
class B{
	public int find(String[]arr){
		Scanner myScanner=new Scanner(System.in);
		System.out.println("请输入你要查找的字符串:");
	    String s=myScanner.next();
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(s)){   
				System.out.println("该字符串在字符串数组中");
			    return i;
			}	 
		}
		{
			    System.out.println("该字符串不在字符串数组中");
				return -1;
			}
		
	}
}