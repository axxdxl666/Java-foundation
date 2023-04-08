package 章节检测;
import java.util.Scanner;

//已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如：
//[10，12，45，90]，添加23后，数组为[10，12，23，45，90]
//笨方法：先扩容在冒牌排序
public class Homework4 {
	
//public static void main(String[]args){
//  int[] arr={10,12,45,90};
//	int[] arrNew=new int[arr.length+1];
//	int temp=0;
//	Scanner myScanner=new Scanner(System.in);
//	System.out.println("请输入你想添加的元素:");
//	int num=myScanner.nextInt();
//	for(int i=0;i<arr.length;i++){
//		arrNew[i]=arr[i];
//	}
//	arrNew[arr.length]=num;
//	arr=arrNew;
	
//	for(int i=0;i<arr.length-1;i++){
//		for(int j=0;j<arr.length-1-i;j++){
//			if(arr[j]>arr[j+1]){
//				temp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=temp;
//			}
//		}
//	
//	}
//			for(int j=0;j<arr.length;j++){
//			System.out.print(arr[j]+" ");
//		}
//	
//}
//}
	//先定位在扩容
	public static void main(String[]args){
	int[] arr={10,12,45,90};
	int index=-1;
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入你想添加的元素:");
	int num=myScanner.nextInt();
	
	for(int i=0;i<arr.length;i++){
		if(num<=arr[i]){
			index=i;
			break;
		}
		if(index==-1){
			index=arr.length;
		}
	}
	int[] arrNew=new int[arr.length+1];
	for(int i=0;i<arrNew.length;i++){
		if(i==index){
			arrNew[i]=num;
		}
		if(i<index){
			arrNew[i]=arr[i];
		}
		if(i>index){
			arrNew[i]=arr[i-1];
		}
	}
	 arr=arrNew;
	 for(int i=0;i<arr.length;i++){
		 System.out.print(arr[i]+" ");
	 }
	
	
}
}
