package ������;

//����ʹ��
//��������У������������Ƿǳ���Ҫ֪ʶ�㣬�����˵�����ر����⣬
//����ע����������˼����Ҫ��������ձ���������
//1.��java����У���Ҫ�ı����������ԣ���Ա�������;ֲ�������
//2.����˵�ľֲ�����һ����ָ�ڳ�Ա�����ж���ı�����
//3.java��������ķ���
//ȫ�ֱ�����Ҳ�������ԣ�������Ϊ��������,�����ڸ���������ʹ��
//�ֲ�������Ҳ���ǳ�������֮�������������������Ϊ�������Ĵ�����У�
//4.ȫ�ֱ��������ԣ����Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ��
//  �ֲ��������븳ֵ�����ʹ�ã���Ϊû��Ĭ��ֵ��

public class VarScope {
public static void main(String[]args){
	Cat c=new Cat();
	c.hi();
	c.cry();
	c.eat();

}
}
class Cat{
	//ȫ�ֱ�����Ҳ�������ԣ�������Ϊ�������� Cat �ࣺcry eat  �ȷ���ʹ������
	//�����ڶ���ʱ������ֱ�Ӹ�ֵ
	int age = 10; //ָ����ֵ�� 10
	//ȫ�ֱ���(����)���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ�� 
	double weight;	//Ĭ��ֵ�� 0.0
	public void hi() {
		//�ֲ��������븳ֵ�󣬲���ʹ�ã���Ϊû��Ĭ��ֵ
		int num = 1;
		String address = " �� �� �� è "; 
		System.out.println("num=" + num);
		System.out.println("address=" + address);
		System.out.println("weight=" + weight);//����
		}
	public void cry() {
		//1. �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		//2. n  ��	name ���Ǿֲ�����
		//3. n  �� name ���������� cry ������
		int n = 10;
		String name = "jack";
		System.out.println("�� cry ��ʹ������ age=" + age);
		}
	public void eat() {
		System.out.println("�� eat ��ʹ������ age=" + age);
		//System.out.println("�� eat ��ʹ�� cry �ı��� name=" + name);//����
		
	}
}