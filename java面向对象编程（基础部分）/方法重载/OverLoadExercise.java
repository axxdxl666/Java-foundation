package ��������;

//1.��д������Methods�ж����������ط��������á�������Ϊm��
//  ���������ֱ����һ��int��������int������һ���ַ���������
//  �ֱ�ִ��ƽ�����㲢����������˲�������������ַ�����Ϣ��
//  �������main()�����зֱ��ò��������������������

//2.��Methods�࣬�����������ط���max().
//  ��һ����������������intֵ�е����ֵ
//  �ڶ�����������������doubleֵ�е����ֵ��
//  ��������������������doubleֵ�е����ֵ
//  ���ֱ������������.


public class OverLoadExercise {
public static void main(String[]args){
	Methods obj=new Methods();
	obj.m(1);
	obj.m(1,2);
	obj.m("java");
	
	//����
	System.out.println(obj.max(10, 24)); // 24
	System.out.println(obj.max(10.0, 21.4)); // 21.4
	System.out.println(obj.max(10.0, 1.4,30.0)); // 30.0
}
}
class Methods{
	public void m(int n){
		System.out.println("ƽ��=" + (n * n));
	}
	public void m(int n1,int n2){
		System.out.println("���=" + (n1 * n2));
	}
	public void m(String str){
		System.out.println("�ַ�����Ϣ=" + str);
	}
	public int max(int n1,int n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	public double max(double n1,double n2){
		if(n1>n2){
			return n1;
		}
		else{
			return n2;
		}
	}
	public double max(double n1,double n2,double n3){
		double max1=n1>n2?n1:n2 ;
		double max2=max1>n3?max1:n3;
		return max2;
	}
	
}