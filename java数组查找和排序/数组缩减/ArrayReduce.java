package ��������;
import java.util.Scanner;
//��һ������{1��2��3��4��5}��
//���Խ������������������ʾ�û��Ƿ����������ÿ����������Ǹ�Ԫ�ء�
//��ֻʣ�����һ��Ԫ�أ���ʾ��������������

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
		 System.out.print("���Ƿ��������?");
		 char key=myScanner.next().charAt(0);
		 if(arr.length==1||key=='n'){
			 System.out.print("���˳�����y");
			 break;
		 }
	}while(true);
}
}
