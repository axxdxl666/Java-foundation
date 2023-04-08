package 二维数组;

//使用方式 4: 静态初始化
//TwoDimensionalArray04.java
//定义 类型 数组名[][]	= {{值 1,值 2..},{值 1,值 2..},{值 1,值 2..}}
//使用即可 [ 固定方式访问 ]

//比如:
//int[][] arr = {{1,1,1}, {8,8,9}, {100}};

//案例：
//int arr[][]={{4,6},{1,4,5,7},{-2}};  
//遍历该二维数组，并得到和

public class TwoDimensionalArray04 {
public static void main(String[]args){
	int arr[][]={{4,6},{1,4,5,7},{-2}};
	int sum=0;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			sum=sum+arr[i][j];
		}
		
	}
	System.out.println("该二维数组和为"+sum);
}
}
