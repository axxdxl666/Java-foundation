package �����������;
import java.util.Scanner;
//Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
//1.ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
//2.���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4}
//3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n

public class ArrayAdd02 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	int[] arr={1,2,3};
	do{
	int[] arrNew=new int[arr.length+1];
	for(int i=0;i<arr.length;i++){
		arrNew[i]=arr[i];	
	}
	  System.out.print("����������Ҫ��ӵ�Ԫ��:");
	  int addNum=myScanner.nextInt();
	  arrNew[arrNew.length-1]=addNum;
	  arr=arrNew;
	  for(int i=0;i<arr.length;i++){
		  System.out.print(arr[i]+" ");
	  }
	  System.out.print("���Ƿ�������?");
	  char key=myScanner.next().charAt(0);
	  if(key=='n'){
		  break;
	  }
	}while(true);
	System.out.println("���˳������...");
}
}
