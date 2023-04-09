package 对象创建的流程分析;

//看一个案例
public class Example {
public static void main(String[]args){
	
}
}
class Person{
	int age=90;
	String name;
	public Person(String n,int a){
		name=n;
		age=a;
	}
	Person p=new Person("小倩",20);
	
}
//流程分析（面试题）
//1.加载Person类信息（Person.class），只会加载一次
//2.在堆中分配空间（地址）
//3.完成对象初始化
//[3.1默认初始化age=0 name=null
// 3.2显式初始化age=90 name=null，
// 3.3构造器的初始化age=20，name=小倩]
//4.在对象在堆中的地址，返回给p（p是对象名，也可以理解成是对象的引用,真正的对象在堆中的空间）
