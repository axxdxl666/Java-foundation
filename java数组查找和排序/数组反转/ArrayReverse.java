package ���鷴ת;

//Ҫ�󣺰������Ԫ�����ݷ�ת�� ArrayReverse.java	
//arr {11,22,33,44,55,66} -> {66, 55,44,33,22,11}
//��ʽ 1��ͨ���ҹ��ɷ�ת

public class ArrayReverse {
public static void main(String[]args){
	 
	//����
	//1. �� arr[0] �� arr[5] ���н��� {66,22,33,44,55,11}
	//2. �� arr[1] �� arr[4] ���н��� {66,55,33,44,22,11}
	//3. �� arr[2] �� arr[3] ���н��� {66,55,44,33,22,11}
	//4. һ��Ҫ���� 3  �� = arr.length / 2
	//5. ÿ�ν���ʱ����Ӧ���±� �� arr[i] �� arr[arr.length - 1 -i]
	
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
