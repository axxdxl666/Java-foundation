package ���󴴽������̷���;

//��һ������
public class Example {
public static void main(String[]args){
	
}
}
class Person{
	int age=90;
	String name;
	public Person(String n,int a){
		name=n;
		age=a;
	}
	Person p=new Person("Сٻ",20);
	
}
//���̷����������⣩
//1.����Person����Ϣ��Person.class����ֻ�����һ��
//2.�ڶ��з���ռ䣨��ַ��
//3.��ɶ����ʼ��
//[3.1Ĭ�ϳ�ʼ��age=0 name=null
// 3.2��ʽ��ʼ��age=90 name=null��
// 3.3�������ĳ�ʼ��age=20��name=Сٻ]
//4.�ڶ����ڶ��еĵ�ַ�����ظ�p��p�Ƕ�������Ҳ���������Ƕ��������,�����Ķ����ڶ��еĿռ䣩
