package 数组添加扩容;

//要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
//1)原始数组使用静态分配 int[] arr = {1,2,3}
//2)增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}

public class ArrayAdd {
public static void main(String[]args){
	int[] arr={1,2,3};
	int[] arrNew=new int[arr.length+1];
	for(int i=0;i<arr.length;i++){
		arrNew[i]=arr[i];	
	}
	  arrNew[3]=4;
	  arr=arrNew;
	  for(int i=0;i<arr.length;i++){
		  System.out.print(arr[i]+" ");
	  }
	  
}
}
