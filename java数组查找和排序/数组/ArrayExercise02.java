package ����;

//�����һ������ int[]�����ֵ {4,-1,9, 10,23}�����õ���Ӧ���±ꡣ

public class ArrayExercise02 {
public static void main(String[]args){
	
	int arr[]={4,-1,9,10,23};
	int max=0;
	int maxIndex =0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
			maxIndex =i;
		}
	}
	
	System.out.println("���ֵΪ"+max+"�±�Ϊ"+maxIndex );
	
}
}
