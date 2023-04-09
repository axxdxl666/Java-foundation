package 方法重载;

//1.编写程序，类Methods中定义三个重载方法并调用。方法名为m。
//  三个方法分别接收一个int参数两个int参数、一个字符串参数。
//  分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
//  在主类的main()方法中分别用参数区别调用三个方法。

//2.在Methods类，定义三个重载方法max().
//  第一个方法，返回两个int值中的最大值
//  第二个方法，返回两个double值中的最大值，
//  第三个方法，返回三个double值中的最大值
//  并分别调用三个方法.


public class OverLoadExercise {
public static void main(String[]args){
	Methods obj=new Methods();
	obj.m(1);
	obj.m(1,2);
	obj.m("java");
	
	//测试
	System.out.println(obj.max(10, 24)); // 24
	System.out.println(obj.max(10.0, 21.4)); // 21.4
	System.out.println(obj.max(10.0, 1.4,30.0)); // 30.0
}
}
class Methods{
	public void m(int n){
		System.out.println("平方=" + (n * n));
	}
	public void m(int n1,int n2){
		System.out.println("相乘=" + (n1 * n2));
	}
	public void m(String str){
		System.out.println("字符串信息=" + str);
	}
	public int max(int n1,int n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	public double max(double n1,double n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	public double max(double n1,double n2,double n3){
		double max1=n1>n2?n1:n2 ;
		double max2=max1>n3?max1:n3;
		return max2;
	}
	
}