package ���鸳ֵ����;

//���鸳ֵ����
//1)�����������͸�ֵ�����ֵ���Ǿ�������ݣ������໥��Ӱ�졣
//int n1 = 2; int n2 = n1;
//2)������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ��
//��һ�����������������鸳ֵ���ڴ�ͼ(�ص�, �ѵ�. )��
//���� ArrayAssign.java int[] arr1 = {1,2,3};
//int[] arr2 = arr1;

public class ArrayAssign {
public static void main(String[]args){
//1)�����������͸�ֵ�����ֵ���Ǿ�������ݣ������໥��Ӱ�졣
	int n1=10;
	int n2=n1;
	
	n2=80;
	System.out.println("n1="+n1);
	System.out.println("n2="+n2);
	
    //������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ,��ֵ��ʽΪ���ø�ֵ
	//arr2�仯��Ӱ�쵽arr1
	int arr1[]={1,2,3};
	int arr2[]=arr1;
	arr2[0]=10;
	System.out.println("arr1[0]="+arr1[0]);
	System.out.println("arr2[0]="+arr2[0]);
	
}
}