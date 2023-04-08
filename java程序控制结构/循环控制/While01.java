package 循环控制;
		// while 基本语法:
		//循环变量初始化;
		//while（循环条件）{
		//     循环体（语句）;
		//     循环变量迭代;
        // }
		//老韩说明
		//1）while循环也有四要素                           
		//2）只是四要素放的位置和for不一样.



		
		//注意事项和细节说明
		//1)循环条件是返回一个布尔值的表达式,true放在循环条件则可以无限循环while(true)
		//2)while 循环是先判断再执行语句

public class While01 {
	//输出 10 句 你好,java！
    public static void main(String[]args){
    	int i=1;
    	while(i<=10){
    		System.out.println("你好，java！");
    		i++;
    	}
    }
}
