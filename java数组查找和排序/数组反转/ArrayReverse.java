package 数组反转;

//要求：把数组的元素内容反转。 ArrayReverse.java	
//arr {11,22,33,44,55,66} -> {66, 55,44,33,22,11}
//方式 1：通过找规律反转

public class ArrayReverse {
public static void main(String[]args){
	 
	//规律
	//1. 把 arr[0] 和 arr[5] 进行交换 {66,22,33,44,55,11}
	//2. 把 arr[1] 和 arr[4] 进行交换 {66,55,33,44,22,11}
	//3. 把 arr[2] 和 arr[3] 进行交换 {66,55,44,33,22,11}
	//4. 一共要交换 3  次 = arr.length / 2
	//5. 每次交换时，对应的下标 是 arr[i] 和 arr[arr.length - 1 -i]
	
	int arr1[]={11,22,33,44,55,66};
	int temp=0;
	for(int i=0;i<arr1.length/2;i++){
		temp=arr1[arr1.length-1-i];
		arr1[arr1.length-1-i]=arr1[i];
		arr1[i]=temp;
	}
	for(int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i] + "\t");//66,55,44,33,22,11
		}
}
}
