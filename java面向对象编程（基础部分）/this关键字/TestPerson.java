package this�ؼ���;

//����Person �࣬
//������ name��age ���ԣ�
//���ṩ compareTo�ȽϷ����������ж��Ƿ����һ������ȣ�
//�ṩ������ TestPerson���ڲ���,
//���ֺ�������ȫһ�����ͷ��� true,  ���򷵻� false

public class TestPerson {
public static void main(String[]args){
	Person p1=new Person("mary", 20);
	Person p2 = new Person("mary", 20);
	System.out.println("p1 �� p2 �ȽϵĽ��=" + p1.compareTo(p2));
}
}
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
	    this.age = age;
	}
	public boolean compareTo(Person p){
		if(this.name.equals(p.name)&&this.age==p.age){
			return true;
		}
		else{
			return false; 
		}
	}
}