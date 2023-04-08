package 数组;

//数组介绍:
//数组可以存放多个同一类型的数据。数组也是一种数据类型，是引用类型。
//即：数(数据)组(一组)就是一组数据

//静态初始化d
//初始化数组
//语法：数据类型数组名[]={元素值，元素值…}
//int a[]={2，5，6，7，8，89，90，34，56}，
//如果知道数组有多少元素，具体值上面的用法相当于：
//int a[]=new int[9]；
//a[0]=2;a[1]=5;a[2]=6;a[3]=7;a[4]=8;a[5]=89;a[6]=90;a[7]=34;a[8]=56;

public class Array01 {
//一个养鸡场有 6 只鸡，它们的体重分别是 3kg,5kg,1kg,3.4kg,2kg,50kg 。
//请问这六只鸡的总体重是多少?平均体重是多少? 请你编一个程序
//思路：
//定义 6 个变量 ,  加起来 总体重， 求出平均体重.引出 -> 数组
public static void main(String[]args){
	
	//老韩解读
	//1. 我们可以通过 hens[下标] 来访问数组的元素
    //	  下标是从 0 开始编号的比如第一个元素就是 hens[0]
    //	  第 2 个元素就是 hens[1]	, 依次类推
	//2. 通过 for 就可以循环的访问 数组的元素/值
	//3. 使用一个变量 totalWeight 将各个元素累积
	
	double hens[]={3,5,1,3.4,2,50};
	double totalWeight=0;
	for(int i=0;i<hens.length;i++){
		totalWeight=totalWeight+hens[i];
	}
	double avgWeight=totalWeight/hens.length;
	System.out.println("这六只鸡的总体重是"+totalWeight+"平均体重是"+avgWeight);
	
}
}
