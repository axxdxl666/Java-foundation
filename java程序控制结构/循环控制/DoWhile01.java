package 循环控制;
//DoWhile基本语法:
//循环变量初始化; 
//do{
//    循环体(语句);
//    循环变量迭代;
// }while(循环条件);

//老韩说明:
//1.do while 是关键字
//1.也有循环四要素, 只是位置不一样
//2.先执行，再判断，也就是说，一定会至少执行一次
//3.最后 有一个 分号 ;
//while 和 do..while 区别举例:  要账

//注意事项和细节说明
//1)循环条件是返回一个布尔值的表达式
//2)do..while 循环是先执行，再判断， 因此它至少执行一次


public class DoWhile01 {
    //输出 10 句 你好,java！
	public static void main(String[]args){
		int i=1;
		do{
			System.out.println(" 你好,java！");
			i++;
		}while(i<=10);
		
		
	}
}
