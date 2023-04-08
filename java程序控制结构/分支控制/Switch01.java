package 分支控制;
import java.util.Scanner;
     //   switch基本语法
     // switch（表达式）{
     //        case 常量1://当…
     //        语句块1;
     //        break;
     //        case 常量2:
     //        语句块2;
     //        break;
     //        ......
     //        case 常量n:
     //        语句块n;
     //        break;
     //        default:
     //        default语句块;
     //        break;
     //  }

	//老韩解读switch
	//1.switch关键字，表示swtich分支
	//2.表达式对应一个值
	//3.case常量1：当表达式的值等于常量1，就执行语句块1
	//4.break;表示退出swtich
	//5.如果和case常量1匹配，就执行语句块1，如果没有匹配，就继续匹配case常量2
	//6.如果一个都没有匹配上，执行default

    //快速入门
    //请编写一个程序，该程序可以接收一个字符，比如:a,b,c,d,e,f,g
    //a 表示星期一，b 表示星期二 …
    //根据用户的输入显示相应的信息.要求使用 switch 语句完成代码

public class Switch01 {
    public static void main(String[]args){
    	Scanner myScanner=new Scanner(System.in);
    	System.out.println("请输入字符:");
    	char c1= myScanner.next().charAt(0);
    	//在 java 中，只要是有值返回，就是一个表达式
    	switch(c1){
    	       case 'a':
    	       System.out.println("a表示星期一");
    	       break;
    	       case 'b':
    	       System.out.println("b表示星期二");
    	       break;
    	       case 'c':
    	       System.out.println("c表示星期三");
    	       break;
    	       case 'd':
    	       System.out.println("d表示星期四");
    	       break;
    	       case 'e':
    	       System.out.println("e表示星期五");
    	       break;
    	       case 'f':
    	       System.out.println("f表示星期六");
    	       break;
    	       case 'g':
    	       System.out.println("g表示星期天");
    	       break;
    	       default:
    	       System.out.println("你输入的字符有误，请重新输入");
    	       break;
    	     	   
    	}
    	
    	
    }
}
