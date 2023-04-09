package 成员方法;

//成员方法的好处
//1)提高代码的复用性
//2)可以将实现的细节封装起来，然后供其他用户来调用即可

//成员方法的定义
//访问修饰符 返回数据类型 方法名（形参列表..） 
//  {
//    方法体语句;
//    return 返回值; 
//}
//1)形参列表：表示成员方法输入 cal(int n) ， getSum(int num1, int num2)
//2)返回数据类型：表示成员方法输出, void 表示没有返回值
//3)方法主体：表示为了实现某一功能代码块
//4)return 语句不是必须的。

//看一个需求：
//请遍历一个数组 , 输出数组的各个元素值。
//int [][] map ={{0,0,1},{1,1,1},{1,1,3}};
//解决思路 1，传统的方法，就是使用单个 for 循环，将数组输出，大家看看问题是什么？
//解决思路 2: 定义一个类 MyTools ,然后写一个成员方法，调用方法实现,看看效果又如何。

public class Method02 {
public static void main(String[]args){
	int[][] map={{0,0,1},{1,1,1},{1,1,3}};
	MyTools tool=new MyTools();
	tool.print(map);
}
}
class MyTools{
	
	public void print(int map[][]){
	for(int i=0;i<map.length;i++){
		for(int j=0;j<map[i].length;j++){
			System.out.print(map[i][j]+" ");
		}
		System.out.println("");
	  }
   }
}