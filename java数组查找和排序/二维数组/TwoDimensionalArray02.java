package ��ά����;

//ʹ�÷�ʽ 1: ��̬��ʼ��
//TwoDimensionalArray02.java
//1)�﷨: ����[][] ������=new ����[��С][��С]
//2)����: int a[][]=new int[2][3]
//3)ʹ����ʾ
//��ά�������ڴ�Ĵ�����ʽ(!!��ͼ) 

//ʹ�÷�ʽ 2: ��̬��ʼ��
//������������ ������[][];
//�ٶ���(���ٿռ�) ������ = new ����[��С][��С] 
//��ֵ(��Ĭ��ֵ������ int	���͵ľ��� 0)

public class TwoDimensionalArray02 {
public static void main(String[]args){
	int[][] arr=new int[2][3];
	arr[1][1]=8;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
