package �������;

//��δ�������
//1)�������ٴ���
//  Cat cat ; //��������
//  cat cat = new Cat(); //����
//2)ֱ�Ӵ���
//Cat cat = new Cat();

//��η�������
//�����﷨
//������.������;
//������ʾ��ֵ�����
//cat.name ; cat.age; cat.color;

//��Ͷ�����ڴ�������(��Ҫ)
//��һ��˼����
//���Ƕ���һ������(Person)(���� ����,����)��
//���ʣ�p2.age�����Ƕ��٣��������ڴ�ͼ��
public class Object03 {
public static void main(String[]args){
	Person2 p1=new Person2();
	p1.name="С��";
	p1.age=10;
	Person2 p2=p1;
	System.out.println(p2.age);//10
}
}
    class Person2{
	String name;
	int age;
	
}