package 循环控制;
		  //for（循环变量初始化;循环条件;循环变量迭代）{
		  //      循环操作(可以多条语句);
		  // }

//老韩说明
//1.for 关键字，表示循环控制
//2.for 有四要素: (1)循环变量初始化(2)循环条件(3)循环操作(4)循环变量迭代
//3.循环操作 , 这里可以有多条语句，也就是我们要循环执行的代码
//4.如果循环操作(语句)只有一条语句，可以省略 {},但建议不要省略

public class For01 {
    public static void main(String[]args){
    	//打印 10 句 "你好，java!"。
    	for(int i=1;i<=10;i++){
    		System.out.println("你好，java！");
    	}
    }
}
