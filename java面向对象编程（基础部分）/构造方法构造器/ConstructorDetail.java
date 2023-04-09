package 构造方法构造器;

//注意事项和使用细节
//1.一个类可以定义多个不同的构造器，即构造器重载
//2.构造器名和类名要相同
//3.构造器没有返回值
//4.构造器是完成对象的初始化，并不是创建对象
//5.在创建对象时，系统自动的调用该类的构造方法
//6.如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器
// (也叫默认构造器),比如Dog(){},使用javap指令反编译看看
//7.一旦定义了自己的构造器，默认的构造器就覆盖了，
//  就不能再使用默认的无参构造器，除非显式的定义一下，
//  即：Dog(){}写（这点很重要）


public class ConstructorDetail {
public static void main(String[]args){
	
	Person p2=new Person("小王",20);
	Person p1=new Person("小王");
	
	Dog d=new Dog();//使用的是默认的无参构造器
	Dog d2=new Dog("旺财");
		
}
}
class Person{
	String name;
	int age;
	public Person(String pName,int pAge){
		System.out.println("构造器一被调用");
		name=pName;
		age=pAge;
	}
	public Person(String pName){
		System.out.println("构造器二被调用");
		name=pName;
		
	}
}
class Dog{
	public Dog(String name){
		
	}
	
	//默认构造器
	Dog(){////显式的定义一下 无参构造器
		
	}
}











