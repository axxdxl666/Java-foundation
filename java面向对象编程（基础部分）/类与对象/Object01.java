package �������;
import java.util.Scanner;

//��Ͷ�����������ϵ
//1)���ǳ���ģ�����ģ�����һ������,��������,è��.., ��������������.
//2)�����Ǿ���ģ�ʵ�ʵģ�����һ����������, �� ��ʵ��.
//3)���Ƕ����ģ�壬���������һ�����壬��Ӧһ��ʵ��

//��һ����èè����
//����̫������ֻèè:
//һֻ���ֽ�С��,���� 3 ��,��ɫ������һֻ��С��,���� 100 ��,��ɫ��
//���дһ�����򣬵��û�����Сè������ʱ������ʾ��è�����֣����䣬��ɫ��
//����û������Сè����������ʾ ����̫û����ֻèè��

public class Object01 {
public static void main(String[]args){
	Cat cat1=new Cat();
	cat1.name="С��";
	cat1.age=3;
	cat1.color="��ɫ";
	Cat cat2=new Cat();
	cat2.name="С��";
	cat2.age=100;
	cat2.color="��ɫ";
	Scanner myScanner=new Scanner(System.in);
	System.out.println("������Сè������:");
	String name=myScanner.next();
	if(name.equals("С��")){
		System.out.println("��һֻè����Ϣ"+" "+cat1.name+" "+cat1.age +" "+cat1.color+" ");
	}
	else if(name.equals("С��")){
		System.out.println("�ڶ�ֻè����Ϣ"+" "+cat2.name+" "+cat2.age +" "+cat2.color+" ");
	}
	else{
		System.out.println("����������ֲ���ȷ,����������!");
	}
}
}
class Cat{
	String name;
	String color;
	int age;
	
}