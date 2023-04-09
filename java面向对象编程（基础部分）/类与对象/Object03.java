package 类与对象;

//如何创建对象
//1)先声明再创建
//  Cat cat ; //声明对象
//  cat cat = new Cat(); //创建
//2)直接创建
//Cat cat = new Cat();

//如何访问属性
//基本语法
//对象名.属性名;
//案例演示赋值和输出
//cat.name ; cat.age; cat.color;

//类和对象的内存分配机制(重要)
//看一个思考题
//我们定义一个人类(Person)(包括 名字,年龄)。
//请问：p2.age究竟是多少？并画出内存图：
public class Object03 {
public static void main(String[]args){
	Person2 p1=new Person2();
	p1.name="小明";
	p1.age=10;
	Person2 p2=p1;
	System.out.println(p2.age);//10
}
}
    class Person2{
	String name;
	int age;
	
}