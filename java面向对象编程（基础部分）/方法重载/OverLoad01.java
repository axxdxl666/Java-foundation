package ��������;

//��������
//java ������ͬһ�����У����ͬ�������Ĵ��ڣ���Ҫ�� �β��б�һ�£� 
//���磺System.out.println();	out �� PrintStream ����

//���صĺô�
//1)�������������鷳
//2)�����˼������鷳

//ע�������ʹ��ϸ��
//1����������������ͬ
//2���β��б����벻ͬ���β����ͻ������˳��������һ����ͬ����������Ҫ��
//3���������ͣ���Ҫ��

//�������Ű���
//�������ࣺMyCalculator	������calculate
//1)calculate(int n1, int n2) //���������ĺ�
//2)calculate(int n1, double n2) //һ��������һ�� double �ĺ�
//3)calculate(double n2, int n1)//һ�� double ,һ�� Int ��
//4)calculate(int n1, int n2,int n3)//���� int �ĺ�

public class OverLoad01 {
public static void main(String[]args){
	MyCalculator obj=new MyCalculator();
	System.out.println(obj.calculate(1,2));
	System.out.println(obj.calculate(1, 2.0));
	System.out.println(obj.calculate(1.0,2));
	System.out.println(obj.calculate(1,2,3));
}
}
class MyCalculator{
	public int calculate(int n1,int n2){
		return n1+n2;
	}
    public double calculate(int n1, double n2){
		return n1+n2;
	}
    public double calculate(double n2, int n1){
    	return n1+n2;
	}
    public int calculate(int n1, int n2,int n3){
    	return n1+n2+n3;
	}
}