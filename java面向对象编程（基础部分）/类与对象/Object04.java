package 类与对象;

//类和对象的内存分配机制
//Java 内存的结构分析
//1)栈： 一般存放基本数据类型(局部变量)
//2)堆： 存放对象(Cat cat ,  数组等)
//3)方法区：常量池(常量，比如字符串)， 类加载信息
//4)示意图	[Cat (name, age, price)]

//Java 创建对象的流程简单分析
//Person p = new Person();
//p.name = “jack”;
//p.age = 10
//1)先加载 Person 类信息(属性和方法信息,只会加载一次)
//2)在堆中分配空间, 进行默认初始化(看规则)
//3)把地址赋给 p , p 就指向对象
//4)进行指定初始化， 比如 p.name =”jack”	p.age = 10

public class Object04 {
	public static void main(String[]args){
		Person3 a=new Person3();
		a.name="小明";
		a.age=10;
		Person3 b;
		b=a;
		System.out.println(b.name);//小明
		b.age=200;
		b=null;
		System.out.println(a.age);//200
		System.out.println(b.age);//出现异常
	}
}
    class Person3{
	    String name;
	    int age;
	
}