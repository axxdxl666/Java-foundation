package ��Ա����;

//��������ϸ��˵��
//1.ͬһ�����еķ������ã�ֱ�ӵ��ü��ɡ�
//2.�����еķ���A�����B�෽������Ҫͨ�����������á����������.��������������
//3.�ر�˵��һ�£�����ķ������úͷ����ķ������η���أ�����ʱ��ô��һ��

public class MethodDetail02 {
	public static void main(String[] args) {
		  A a = new A();
		  //a.sayOk();
	      a.m1();
	}
	}
	class A {
	//ͬһ�����еķ������ã�ֱ�ӵ��ü���
	//
	public void print(int n) {
	      System.out.println("print()���������� n=" + n);
	}


	public void sayOk() { //sayOk ���� print(ֱ�ӵ��ü���)
	       print(10);
	       System.out.println("����ִ�� sayOK()~~~");
	}


	//�����еķ��� A ����� B �෽������Ҫͨ������������
	public void m1() {
	     //���� B ����,  Ȼ���ڵ��÷�������
	      System.out.println("m1() ����������"); 
	      B b = new B();
	      b.hi();
	      System.out.println("m1() ����ִ��:)");
	}
	}


	class B {
	public void hi() {
	      System.out.println("B ���е� hi()��ִ��");
	}
	}



