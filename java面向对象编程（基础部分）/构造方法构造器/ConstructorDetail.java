package ���췽��������;

//ע�������ʹ��ϸ��
//1.һ������Զ�������ͬ�Ĺ�������������������
//2.��������������Ҫ��ͬ
//3.������û�з���ֵ
//4.����������ɶ���ĳ�ʼ���������Ǵ�������
//5.�ڴ�������ʱ��ϵͳ�Զ��ĵ��ø���Ĺ��췽��
//6.�������Աû�ж��幹������ϵͳ���Զ���������һ��Ĭ���޲ι�����
// (Ҳ��Ĭ�Ϲ�����),����Dog(){},ʹ��javapָ����뿴��
//7.һ���������Լ��Ĺ�������Ĭ�ϵĹ������͸����ˣ�
//  �Ͳ�����ʹ��Ĭ�ϵ��޲ι�������������ʽ�Ķ���һ�£�
//  ����Dog(){}д��������Ҫ��


public class ConstructorDetail {
public static void main(String[]args){
	
	Person p2=new Person("С��",20);
	Person p1=new Person("С��");
	
	Dog d=new Dog();//ʹ�õ���Ĭ�ϵ��޲ι�����
	Dog d2=new Dog("����");
		
}
}
class Person{
	String name;
	int age;
	public Person(String pName,int pAge){
		System.out.println("������һ������");
		name=pName;
		age=pAge;
	}
	public Person(String pName){
		System.out.println("��������������");
		name=pName;
		
	}
}
class Dog{
	public Dog(String name){
		
	}
	
	//Ĭ�Ϲ�����
	Dog(){////��ʽ�Ķ���һ�� �޲ι�����
		
	}
}











