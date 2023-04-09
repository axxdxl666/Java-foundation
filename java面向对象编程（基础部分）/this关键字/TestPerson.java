package this关键字;

//定义Person 类，
//里面有 name、age 属性，
//并提供 compareTo比较方法，用于判断是否和另一个人相等，
//提供测试类 TestPerson用于测试,
//名字和年龄完全一样，就返回 true,  否则返回 false

public class TestPerson {
public static void main(String[]args){
	Person p1=new Person("mary", 20);
	Person p2 = new Person("mary", 20);
	System.out.println("p1 和 p2 比较的结果=" + p1.compareTo(p2));
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