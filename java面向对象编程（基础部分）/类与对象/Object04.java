package �������;

//��Ͷ�����ڴ�������
//Java �ڴ�Ľṹ����
//1)ջ�� һ���Ż�����������(�ֲ�����)
//2)�ѣ� ��Ŷ���(Cat cat ,  �����)
//3)��������������(�����������ַ���)�� �������Ϣ
//4)ʾ��ͼ	[Cat (name, age, price)]

//Java ������������̼򵥷���
//Person p = new Person();
//p.name = ��jack��;
//p.age = 10
//1)�ȼ��� Person ����Ϣ(���Ժͷ�����Ϣ,ֻ�����һ��)
//2)�ڶ��з���ռ�, ����Ĭ�ϳ�ʼ��(������)
//3)�ѵ�ַ���� p , p ��ָ�����
//4)����ָ����ʼ���� ���� p.name =��jack��	p.age = 10

public class Object04 {
	public static void main(String[]args){
		Person3 a=new Person3();
		a.name="С��";
		a.age=10;
		Person3 b;
		b=a;
		System.out.println(b.name);//С��
		b.age=200;
		b=null;
		System.out.println(a.age);//200
		System.out.println(b.age);//�����쳣
	}
}
    class Person3{
	    String name;
	    int age;
	
}