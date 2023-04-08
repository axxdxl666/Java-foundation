package 数组;
import java.util.Scanner;
//数组的使用
//使用方式1-动态初始化
//数组的定义
//数据类型     数组名[]=new数据类型[大小]   
//或:数据类型[]  数组名=new数据类型[大小]
//int a[]=new int[5];//创建了一个数组，名字a，存放5个int

//数组的引用（使用/访问/获取数组元素）
//数组名[下标/索引/index]  比如：你要使用a数组的第3个数  即a[2]

//使用方式 2-动态初始化
//据类型 数组名[];	
//也可以	数据类型[] 数组名;
//int a[];  或者 int[] a;
//创建数组
//语法: 数组名=new 数据类型[大小]; 
//a=new int[10];

//使用方式 3-静态初始化
//初始化数组
//语法：数据类型数组名[]={元素值，元素值…}
//int a[]={2，5，6，7，8，89，90，34，56}，
//如果知道数组有多少元素，具体值上面的用法相当于：
//int a[]=new int[9]；
//a[0]=2;a[1]=5;a[2]=6;a[3]=7;a[4]=8;a[5]=89;a[6]=90;a[7]=34;a[8]=56;


public class Array02 {
public static void main(String[]args){
	//快速入门案例
	//循环输入5个成绩，保存到double数组，并输出
	Scanner myScanner=new Scanner(System.in);
	//(1) 第一种动态分配方式
	//double scores[] = new double[5];
	//(2) 第 2 种动态分配方式， 先声明数组，再 new 分配空间
	double score[] ; //声明数组， 这时 scores 是 null 
	score = new double[5]; // 分配内存空间，可以存放数据

	//循环输入
	for(int i=0;i<score.length;i++){
		System.out.println("请输入第"+(i+1)+"个元素的值");
		score[i]=myScanner.nextDouble();
	}
	//循环输出
		for(int i=0;i<score.length;i++){
			
			System.out.println("第"+(i+1)+"个元素的值为"+score[i]);
			
		}
}
}
