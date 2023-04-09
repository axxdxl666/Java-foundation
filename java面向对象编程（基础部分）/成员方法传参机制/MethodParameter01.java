package 成员方法传参机制;

//基本数据类型的传参机制
//基本数据类型,传递的是值（值拷贝）,形参的任何改变不影响实参！

//看一个案例，分析输出什么
public class MethodParameter01 {
public static void main(String[]args){
	int a=10;
	int b=20;
	AA obj=new AA();
	obj.swap(10,20);
	System.out.println("\nmain 方法 a=" + a + " b=" + b);
	//a=10 b=20,因为swap中a和b的交换不影响主方法中的a和b,虽然名称一样，但互步影响，作用域不同
}
}
class AA{
	public void swap(int a,int b){
		System.out.println("\na 和 b 交换前的值\na=" + a + "\tb=" + b);//a=10 b=20
		int temp=a;
		    a=b;
		    b=a;
		System.out.println("\na 和 b 交换后的值\na=" + a + "\tb=" + b);//a=20 b=10
	}
}