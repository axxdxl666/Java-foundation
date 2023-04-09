package 可变参数;

//基本概念
//java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。
//就可以通过可变参数实现

//基本语法
//访问修饰符 返回类型 方法名(数据类型...  形参名) {
//
//}

//注意事项和使用细节
//1）可变参数的实参可以为0个或任意多个。
//2）可变参数的实参可以为数组。
//3）可变参数的本质就是数组.
//4）可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
//5）一个形参列表中只能出现一个可变参数

//快速入门案例
//看一个案例 类 HspMethod，方法 sum	【可以计算 2 个数的和，3 个数的和 .....n个数的和】

public class VarParameter01 {
public static void main(String[]args){
	HspMethod m = new HspMethod(); 
	System.out.println(m.sum(1, 5, 100)); //106 
	System.out.println(m.sum(1,19)); //20
}
}
class HspMethod{
	//1. int... 表示接受的是可变参数，类型是 int ,即可以接收多个 int(0-多)
	//2. 使用可变参数时，可以当做数组来使用 即 nums 可以当做数组
	//3. 遍历 nums 求和即可
	public int sum(int... nums) {
		System.out.println("接收的参数个数=" + nums.length); 
		int res=0;
		for(int i=0;i<nums.length;i++){
			res=res+nums[i];
		}
		return res;
		
}
}