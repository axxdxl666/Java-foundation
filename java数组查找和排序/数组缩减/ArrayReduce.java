package 数组缩减;
import java.util.Scanner;
//有一个数组{1，2，3，4，5}，
//可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。
//当只剩下最后一个元素，提示，不能再缩减。

public class ArrayReduce {
public static void main(String[]args){
	int[] arr={1,2,3,4,5};
	Scanner myScanner=new Scanner(System.in);
	do{
		int[] arrNew=new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++){
			arrNew[i]=arr[i];
		}
		arr=arrNew;
		 for(int i=0;i<arr.length;i++){
			  System.out.print(arr[i]+" ");
		  }
		 System.out.print("你是否继续缩减?");
		 char key=myScanner.next().charAt(0);
		 if(arr.length==1||key=='n'){
			 System.out.print("你退出缩减y");
			 break;
		 }
	}while(true);
}
}
