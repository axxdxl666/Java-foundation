package 数组拷贝;

//编写代码 实现数组拷贝(内容复制) ArrayCopy.java
//将 int[] arr1 = {10,20,30};拷贝到 arr2 数组,要求数据空间是独立的.

public class ArrayCopy {
public static void main(String[]args){
	int arr1[]={10,20,30};
	
	//创建一个新的数组arr2，开辟新的数据空间
	//大小 arr1.length;
	int arr2[]=new int[arr1.length];

	//遍历 arr1 ，把每个元素拷贝到 arr2 对应的元素位置
	for(int i=0;i<arr1.length;i++){
		arr2[i]=arr1[i];
	}

	//修改 arr2， 不会对 arr1 有影响. 
	arr2[0] = 100;

	//输出 arr1
	System.out.println("====arr1 的元素====");
	for(int i = 0; i < arr1.length; i++) {
	System.out.println(arr1[i]);//10,20,30
	}
	
	//输出 arr2
	System.out.println("====arr2 的元素===="); 
	for(int i = 0; i < arr2.length; i++) {
		System.out.println(arr2[i]);//
		}


}
}
