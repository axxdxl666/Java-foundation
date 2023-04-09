package 类与对象;
import java.util.Scanner;

//类和对象的区别和联系
//1)类是抽象的，概念的，代表一类事物,比如人类,猫类.., 即它是数据类型.
//2)对象是具体的，实际的，代表一个具体事物, 即 是实例.
//3)类是对象的模板，对象是类的一个个体，对应一个实例

//看一个养猫猫问题
//张老太养了两只猫猫:
//一只名字叫小白,今年 3 岁,白色。还有一只叫小花,今年 100 岁,花色。
//请编写一个程序，当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。
//如果用户输入的小猫名错误，则显示 张老太没有这只猫猫。

public class Object01 {
public static void main(String[]args){
	Cat cat1=new Cat();
	cat1.name="小白";
	cat1.age=3;
	cat1.color="白色";
	Cat cat2=new Cat();
	cat2.name="小花";
	cat2.age=100;
	cat2.color="花色";
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入小猫的名字:");
	String name=myScanner.next();
	if(name.equals("小白")){
		System.out.println("第一只猫的信息"+" "+cat1.name+" "+cat1.age +" "+cat1.color+" ");
	}
	else if(name.equals("小花")){
		System.out.println("第二只猫的信息"+" "+cat2.name+" "+cat2.age +" "+cat2.color+" ");
	}
	else{
		System.out.println("你输入的名字不正确,请重新输入!");
	}
}
}
class Cat{
	String name;
	String color;
	int age;
	
}