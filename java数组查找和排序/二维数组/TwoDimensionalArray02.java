package 二维数组;

//使用方式 1: 动态初始化
//TwoDimensionalArray02.java
//1)语法: 类型[][] 数组名=new 类型[大小][大小]
//2)比如: int a[][]=new int[2][3]
//3)使用演示
//二维数组在内存的存在形式(!!画图) 

//使用方式 2: 动态初始化
//先声明：类型 数组名[][];
//再定义(开辟空间) 数组名 = new 类型[大小][大小] 
//赋值(有默认值，比如 int	类型的就是 0)

public class TwoDimensionalArray02 {
public static void main(String[]args){
	int[][] arr=new int[2][3];
	arr[1][1]=8;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
