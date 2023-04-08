package 数组添加扩容;
import java.util.Scanner;
//要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
//1.原始数组使用静态分配 int[] arr = {1,2,3}
//2.增加的元素 4，直接放在数组的最后 arr = {1,2,3,4}
//3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n

public class ArrayAdd02 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	int[] arr={1,2,3};
	do{
	int[] arrNew=new int[arr.length+1];
	for(int i=0;i<arr.length;i++){
		arrNew[i]=arr[i];	
	}
	  System.out.print("请输入你需要添加的元素:");
	  int addNum=myScanner.nextInt();
	  arrNew[arrNew.length-1]=addNum;
	  arr=arrNew;
	  for(int i=0;i<arr.length;i++){
		  System.out.print(arr[i]+" ");
	  }
	  System.out.print("你是否继续添加?");
	  char key=myScanner.next().charAt(0);
	  if(key=='n'){
		  break;
	  }
	}while(true);
	System.out.println("你退出了添加...");
}
}
