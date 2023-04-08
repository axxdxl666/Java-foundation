package 二维数组;

//什么是二维数组：
//1. 从定义形式上看 int[][]
//2. 可以这样理解，原来的一维数组的每个元素是一维数组, 就构成二维数组
//关于二维数组的关键概念
//(1)System.out.println("二维数组的元素个数=" + arr.length);
//(2) 二维数组的每个元素是一维数组, 所以如果需要得到每个一维数组的值还需要再次遍历
//(3) 如果我们要访问第 (i+1)个一维数组的第 j+1个值 arr[i][j];
//举例 访问  =》 他是第 3 个一维数组的第 4 个值 arr[2][3]
//System.out.println("第 3 个一维数组的第 4 个值=" + arr[2][3]); //3


//6.14.1快速入门案例：
//TwoDimensionalArray01.java 
//请用二维数组输出如下图形
//0 0 0 0 0 0
//0 0 1 0 0 0
//0 2 0 3 0 0
//0 0 0 0 0 0


public class TwoDimensionalArray01 {
public static void main(String[]args){
	int[][] arr={{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
