package 数组赋值机制;

//数组赋值机制
//1)基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
//int n1 = 2; int n2 = n1;
//2)数组在默认情况下是引用传递，赋的值是地址。
//看一个案例，并分析数组赋值的内存图(重点, 难点. )。
//代码 ArrayAssign.java int[] arr1 = {1,2,3};
//int[] arr2 = arr1;

public class ArrayAssign {
public static void main(String[]args){
//1)基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
	int n1=10;
	int n2=n1;
	
	n2=80;
	System.out.println("n1="+n1);
	System.out.println("n2="+n2);
	
    //数组在默认情况下是引用传递，赋的值是地址,赋值方式为引用赋值
	//arr2变化会影响到arr1
	int arr1[]={1,2,3};
	int arr2[]=arr1;
	arr2[0]=10;
	System.out.println("arr1[0]="+arr1[0]);
	System.out.println("arr2[0]="+arr2[0]);
	
}
}