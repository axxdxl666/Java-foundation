package ��Ա����;
//��Ա������������
//1)��� speak  ��Ա����,��� ������һ�����ˡ�
//2)��� cal01  ��Ա����,���Լ���� 1+2+..+1000 �Ľ��
//3)��� cal02  ��Ա����,�÷������Խ���һ���� n������� 1+..+n �Ľ��
//4)��� getSum ��Ա����,���Լ����������ĺ�

public class Method01 {
public static void main(String[]args){
	Person p1=new Person();
	p1.speak();
    p1.cal01();
    p1.cal02(50);
    p1.getSum(1, 2);
    //�� ���� getSum ���ص�ֵ���������� res 
    int res=p1.getSum(10, 20);
    System.out.println("�������ĺ�="+res);
}
}
class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("����һ������");
	}
	public void cal01(){
		int sum=0;
		for(int i=1;i<=1000;i++){
			sum=sum+i;
		}
		System.out.println("1+2+..+1000 �Ľ��="+sum);
	}
	public void cal02(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("1+..+n �Ľ��="+sum);
	}
	public int getSum(int n1,int n2){
		int n3=n1+n2;
		return n3;
		
	}
	
}