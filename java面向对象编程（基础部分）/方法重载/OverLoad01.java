package 方法重载;

//基本介绍
//java 中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致！ 
//比如：System.out.println();	out 是 PrintStream 类型

//重载的好处
//1)减轻了起名的麻烦
//2)减轻了记名的麻烦

//注意事项和使用细节
//1）方法名：必须相同
//2）形参列表：必须不同（形参类型或个数或顺序，至少有一样不同，参数名无要求）
//3）返回类型：无要求

//快速入门案例
//案例：类：MyCalculator	方法：calculate
//1)calculate(int n1, int n2) //两个整数的和
//2)calculate(int n1, double n2) //一个整数，一个 double 的和
//3)calculate(double n2, int n1)//一个 double ,一个 Int 和
//4)calculate(int n1, int n2,int n3)//三个 int 的和

public class OverLoad01 {
public static void main(String[]args){
	MyCalculator obj=new MyCalculator();
	System.out.println(obj.calculate(1,2));
	System.out.println(obj.calculate(1, 2.0));
	System.out.println(obj.calculate(1.0,2));
	System.out.println(obj.calculate(1,2,3));
}
}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1+n2;
	}
    public double calculate(int n1, double n2){
		return n1+n2;
	}
    public double calculate(double n2, int n1){
    	return n1+n2;
	}
    public int calculate(int n1, int n2,int n3){
    	return n1+n2+n3;
	}
}