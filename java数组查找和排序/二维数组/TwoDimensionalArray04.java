package ��ά����;

//ʹ�÷�ʽ 4: ��̬��ʼ��
//TwoDimensionalArray04.java
//���� ���� ������[][]	= {{ֵ 1,ֵ 2..},{ֵ 1,ֵ 2..},{ֵ 1,ֵ 2..}}
//ʹ�ü��� [ �̶���ʽ���� ]

//����:
//int[][] arr = {{1,1,1}, {8,8,9}, {100}};

//������
//int arr[][]={{4,6},{1,4,5,7},{-2}};  
//�����ö�ά���飬���õ���

public class TwoDimensionalArray04 {
public static void main(String[]args){
	int arr[][]={{4,6},{1,4,5,7},{-2}};
	int sum=0;
	for(int i=0;i<arr.length;i++){
		for(int j=0;j<arr[i].length;j++){
			sum=sum+arr[i][j];
		}
		
	}
	System.out.println("�ö�ά�����Ϊ"+sum);
}
}
