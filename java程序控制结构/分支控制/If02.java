package 分支控制;
import java.util.Scanner;
     //双分支
     //基本语法
     //if（条件表达式）{
     //   执行代码块1;
     // }
     //else{
     //   执行代码块2;
     // }
     //说明：
     //当条件表达式成立，即执行代码块1，否则执行代码块2.如果执行代码块只有一条语句，则{}可以省略，否则，不能省略


public class If02 {
	//编写一个 main 方法
	public static void main(String[] args) {
	//编写一个程序,可以输入人的年龄,如果该同志的年龄大于 18 岁,
	//则输出 "你年龄大于 18,要对
	//自己的行为负责, 送入监狱"。否则 ,输出"你的年龄不大这次放过你了."
	//
	//思路分析
	//1. 接收输入的年龄,  应该定义一个 Scanner 对象
	//2. 把年龄保存到一个变量 int age
	//3. 使用 if-else 判断，输出对应信息
		//应该定义一个 Scanner 对象
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄");
		//把年龄保存到一个变量 int age 
		int age = myScanner.nextInt();
		//使用 if-else 判断，输出对应信息
		if(age > 18) {
		System.out.println("你年龄大于 18,要对自己的行为负责,送入监狱");
		} else {//双分支
		System.out.println("你的年龄不大这次放过你了");
		}


		System.out.println("程序继续...");
   
		
			
			
}
	}
