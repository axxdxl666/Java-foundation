package z�½ڼ��;

//.����һ��Employee��
//�����У����֣��Ա����䣬ְλ��нˮ��
//�ṩ3�����췽�������Գ�ʼ��
//��1�������֣��Ա����䣬ְλ��нˮ��
//��2�������֣��Ա����䣩
//��3����ְλ��нˮ��
//Ҫ���ָ��ù�����
//���ʹ������﷨��this(�����б�); 
//ע��ֻ���ڹ�������ʹ��(��ֻ���ڹ������з�������һ��������, ������ڵ�һ�����)

public class zHomework12 {
public static void main(String[]args){
	Employee e1=new Employee("С��",'��',20,"IT",500000);
	System.out.println("����:"+e1.name+" "+"�Ա�:"+e1.sex+" "+"����:"+e1.age+" "+"ְλ:"+e1.occupation+" "+"нˮ:"+e1.salary);
	Employee e2=new Employee("С��",'��',20);
	System.out.println("����:"+e2.name+" "+"�Ա�:"+e2.sex+" "+"����:"+e2.age);
	Employee e3=new Employee("IT",500000);
	System.out.println("ְλ:"+e3.occupation+" "+"нˮ:"+e3.salary);
	
}
}
class Employee{
	String name;
	char sex;
	int age;
	String occupation;
	int salary;
	
	
	public Employee(String occupation,int salary){
		this.occupation=occupation;
		this.salary=salary;
		
	}
	public Employee(String name,char sex,int age){
		this.name=name;
		this.sex=sex;
		this.age=age;
		
	}
	public Employee(String name,char sex,int age,String occupation,int salary){	
		this(name,sex,age);
		this.occupation=occupation;
		this.salary=salary;
		
	}
	
	
}