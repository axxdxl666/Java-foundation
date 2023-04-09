package this关键字;

//this的注意事项和使用细节 
//1)this 关键字可以用来访问本类的属性、方法、构造器
//2)this 用于区分当前类的属性和局部变量
//3)访问成员方法的语法：this.方法名(参数列表)
//4)访问构造器语法：this(参数列表); 
//  注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 必须放在第一条语句)
//5)this 不能在类定义的外部使用，只能在类定义的方法中使用。

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
		System.out.println("f1()方法..");
	}
	public void f2(){
		System.out.println("f2()方法..");
		//访问成员方法的语法：this.方法名(参数列表)
		this.f1();
		f1();
	}
	public void f3(){
		//this 关键字可以用来访问本类的属性、方法、构造器
		System.out.println("name="+this.name+" "+"age="+this.num);
	}
	public T(){
		//访问构造器语法：this(参数列表); 
	    //注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 必须放在第一条语句)
		this("小李",20);
		System.out.println("T()构造器被调用");
		
	}
    public T(String name,int age){
    	System.out.println("T(String name,int age)构造器被调用");
	}
	
}





