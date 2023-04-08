package 三元运算符;
      //1) 表达式 1 和表达式 2 要为可以赋给接收变量的类型(或可以自动转换)
      //2) 三元运算符可以转成 if--else 语句
      //int res = a > b ?	a++ :	--b;
      //if ( a > b) res = a++;
      //else res = --b;
public class TernaryOperatorDetail {
	// 编写一个 main 方法
	public static void main(String[] args) {
	//  表达式 1 和表达式 2 要为可以赋给接收变量的类型
	//  (或可以自动转换/或者强制转换) 
		int a = 3;
	    int b = 8;
	    int c = a > b ? (int)1.1 : (int)3.4;//可以的
	    double d = a > b ? a : b + 3;//可以的，满足 int -> double
	}
}
