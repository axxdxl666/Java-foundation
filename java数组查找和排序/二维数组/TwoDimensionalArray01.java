package ��ά����;

//ʲô�Ƕ�ά���飺
//1. �Ӷ�����ʽ�Ͽ� int[][]
//2. ����������⣬ԭ����һά�����ÿ��Ԫ����һά����, �͹��ɶ�ά����
//���ڶ�ά����Ĺؼ�����
//(1)System.out.println("��ά�����Ԫ�ظ���=" + arr.length);
//(2) ��ά�����ÿ��Ԫ����һά����, ���������Ҫ�õ�ÿ��һά�����ֵ����Ҫ�ٴα���
//(3) �������Ҫ���ʵ� (i+1)��һά����ĵ� j+1��ֵ arr[i][j];
//���� ����  =�� ���ǵ� 3 ��һά����ĵ� 4 ��ֵ arr[2][3]
//System.out.println("�� 3 ��һά����ĵ� 4 ��ֵ=" + arr[2][3]); //3


//6.14.1�������Ű�����
//TwoDimensionalArray01.java 
//���ö�ά�����������ͼ��
//0 0 0 0 0 0
//0 0 1 0 0 0
//0 2 0 3 0 0
//0 0 0 0 0 0


public class TwoDimensionalArray01 {
public static void main(String[]args){
	int[][] arr={{0,0,0,0,0,0},{0,0,1,0,0,0},{0,2,0,3,0,0},{0,0,0,0,0,0}};
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
