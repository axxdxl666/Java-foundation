package this�ؼ���;

//this��ע�������ʹ��ϸ�� 
//1)this �ؼ��ֿ����������ʱ�������ԡ�������������
//2)this �������ֵ�ǰ������Ժ;ֲ�����
//3)���ʳ�Ա�������﷨��this.������(�����б�)
//4)���ʹ������﷨��this(�����б�); 
//  ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)
//5)this �������ඨ����ⲿʹ�ã�ֻ�����ඨ��ķ�����ʹ�á�

public class ThisDetail {
public static void main(String[]args){
	//T t1=new T();
	//t1.f2();
	T t2=new T();
	System.out.println();
	t2.f3();
	
}
}
class T{
	String name="jack";
	int num=100;
	public void f1(){
		System.out.println("f1()����..");
	}
	public void f2(){
		System.out.println("f2()����..");
		//���ʳ�Ա�������﷨��this.������(�����б�)
		this.f1();
		f1();
	}
	public void f3(){
		//this �ؼ��ֿ����������ʱ�������ԡ�������������
		System.out.println("name="+this.name+" "+"age="+this.num);
	}
	public T(){
		//���ʹ������﷨��this(�����б�); 
	    //ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)
		this("С��",20);
		System.out.println("T()������������");
		
	}
    public T(String name,int age){
    	System.out.println("T(String name,int age)������������");
	}
	
}





