package 数组;

//请求出一个数组 int[]的最大值 {4,-1,9, 10,23}，并得到对应的下标。

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
	
	System.out.println("最大值为"+max+"下标为"+maxIndex );
	
}
}
