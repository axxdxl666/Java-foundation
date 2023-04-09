package 作用域; 

//1.属性和局部变量可以重名，访问时遵循就近原则。
//2.在同一个作用域中，比如在同一个成员方法中，两个局部变量，不能重名。
//3.属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。
//  局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁即在一次方法调用过程中。
//4.作用域范围不同
//  全局变量/属性：可以被本类使用，或其他类使用（通过对象调用）
//  局部变量：只能在本类中对应的方法中使用
//5.修饰符不同
//  全局变量/属性可以加修饰符
//  局部变量不可以加修饰符


public class VarScopeDetail {
public static void main(String[]args){
	

	 Person p1 = new Person();
	//p1.say();//当执行 say 方法时，say 方法的局部变量比如 name,会创建，当 say 执行完毕后
	//name 局部变量就销毁,但是属性(全局变量)仍然可以使用
	//
	 T t1 = new T();
	 t1.test(); //第 1 种跨类访问对象属性的方式
	 t1.test2(p1);//第 2 种跨类访问对象属性的方式
}
}
class T{
	//全局变量/属性：可以被本类使用，或其他类使用（通过对象调用)
     public void test() {
		Person p1 = new Person();
		System.out.println(p1.name);//jack
	}
     
     public void test2(Person p) { 
    	 System.out.println(p.name);//jack
     }
}
class Person {
	//细节: 属性可以加修饰符(public protected private..)
    //局部变量不能加修饰符
	public int age = 20;
	String name = "jack";

	public void say() {
	//细节 属性和局部变量可以重名，访问时遵循就近原则
	String name = "king"; 
	System.out.println("say() name=" + name);
	}

	public void hi() {
	String address = "北京";
	//String address = "上海";//错误,重复定义变量
	String name = "hsp";//可以
	}
	}