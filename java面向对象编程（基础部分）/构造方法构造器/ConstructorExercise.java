package ���췽��������;

//��ǰ�涨��� Person �������������������
//��һ���޲ι����������ù��������������˵� age ���Գ�ʼֵ��Ϊ 18
//�ڶ����� pName �� pAge ���������Ĺ�����:ʹ��ÿ�δ��� Person �����ͬʱ��ʼ������� age ����ֵ�� name ����ֵ��
//�ֱ�ʹ�ò�ͬ�Ĺ���������������.

public class ConstructorExercise {
public static void main(String[]args){
	Person2 p1=new Person2();
	System.out.println("p1 ����Ϣ name=" + p1.name + " age=" + p1.age);
	Person2 p2=new Person2("С��",20);
	System.out.println("p2 ����Ϣ name=" + p2.name + " age=" + p2.age);

}
}
class Person2{
	String name;
	int age;
	public Person2(){
	   age=18;
	}
	public Person2(String pName,int pAge){
		name=pName;
		age=pAge;
	}
}