package ��ά����;

//ʹ�÷�ʽ 3: ��̬��ʼ��-������ȷ��
/*
��һ�����󣺶�̬���������ά���飬�����

i = 0:	1
i = 1:	2	2
i = 2:	3	3	3

һ��������һά����, ÿ��һά�����Ԫ���ǲ�һ����
*/

public class TwoDimensionalArray03 {
public static void main(String[]args){
	int[][] arr=new int[3][];
	for(int i=0;i<arr.length;i++){
	    arr[i]=new int[i+1];
	    for(int j=0;j<arr[i].length;j++){
	    	arr[i][j]=i+1;
	    	System.out.print(arr[i][j]+" ");
	    }
	    System.out.println("");
	}
	
}
}
