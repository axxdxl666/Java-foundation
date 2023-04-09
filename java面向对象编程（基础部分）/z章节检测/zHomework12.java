package z章节检测;

//.创建一个Employee类
//属性有（名字，性别，年龄，职位，薪水）
//提供3个构造方法，可以初始化
//（1）（名字，性别，年龄，职位，薪水）
//（2）（名字，性别，年龄）
//（3）（职位，薪水）
//要求充分复用构造器
//访问构造器语法：this(参数列表); 
//注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 必须放在第一条语句)

public class zHomework12 {
public static void main(String[]args){
	Employee e1=new Employee("小李",'男',20,"IT",500000);
	System.out.println("名字:"+e1.name+" "+"性别:"+e1.sex+" "+"年龄:"+e1.age+" "+"职位:"+e1.occupation+" "+"薪水:"+e1.salary);
	Employee e2=new Employee("小李",'男',20);
	System.out.println("名字:"+e2.name+" "+"性别:"+e2.sex+" "+"年龄:"+e2.age);
	Employee e3=new Employee("IT",500000);
	System.out.println("职位:"+e3.occupation+" "+"薪水:"+e3.salary);
	
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