package �½ڼ��;
import java.util.Scanner;

//��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ�����򣬱��磺
//[10��12��45��90]�����23������Ϊ[10��12��23��45��90]
//����������������ð������
public class Homework4 {
	
//public static void main(String[]args){
//  int[] arr={10,12,45,90};
//	int[] arrNew=new int[arr.length+1];
//	int temp=0;
//	Scanner myScanner=new Scanner(System.in);
//	System.out.println("������������ӵ�Ԫ��:");
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
	//�ȶ�λ������
	public static void main(String[]args){
	int[] arr={10,12,45,90};
	int index=-1;
	Scanner myScanner=new Scanner(System.in);
	System.out.println("������������ӵ�Ԫ��:");
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
