package �����������;

//Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
//1)ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
//2)���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4}

public class ArrayAdd {
public static void main(String[]args){
	int[] arr={1,2,3};
	int[] arrNew=new int[arr.length+1];
	for(int i=0;i<arr.length;i++){
		arrNew[i]=arr[i];	
	}
	  arrNew[3]=4;
	  arr=arrNew;
	  for(int i=0;i<arr.length;i++){
		  System.out.print(arr[i]+" ");
	  }
	  
}
}
