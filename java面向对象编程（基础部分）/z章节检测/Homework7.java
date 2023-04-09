package z章节检测;

//设计一个Dog类，有名字、颜色和年龄属性，
//定义输出方法show（）显示其信息
//[提示 this.属性，自己做]

public class Homework7 {
public static void main(String[]args){
	Dog dog=new Dog("旺财","白色",5);
	dog.show();
}
}
class Dog{
	String name;
	String color;
	int age;
	public Dog(String name,String color,int age){
		this.name=name;
		this.color=color;
		this.age=age;
	}
	public void show(){
		System.out.println("这只狗的名字叫"+name+",颜色为"+color+",年龄为"+age);
	}
}