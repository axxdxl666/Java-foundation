package z�½ڼ��;

//���һ��Dog�࣬�����֡���ɫ���������ԣ�
//�����������show������ʾ����Ϣ
//[��ʾ this.���ԣ��Լ���]

public class Homework7 {
public static void main(String[]args){
	Dog dog=new Dog("����","��ɫ",5);
	dog.show();
}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public void show(){
		System.out.println("��ֻ�������ֽ�"+name+",��ɫΪ"+color+",����Ϊ"+age);
	}
}