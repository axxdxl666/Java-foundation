package 循环控制;
    //for循环注意事项和细节说明:
	//1)循环条件是返回一个布尔值的表达式
	//2)for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
	//3)循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。
	//4)使用内存分析法，老师分析输出下面代码输出什么?

public class ForDetail {
   public static void main(String[]args){
	   int count=3;
	   for(int i=0,j=0;i<count;i++,j+=2){
		   System.out.println("i="+i+"j="+j);
	   }
   }
}
