package z章节检测 ;
import java.lang.Math;

//定义一个圆类Circle，
//定义属性：半径，提供显示圆周长功能的方法，提供显示圆面积的方法

public class Homework5 {
public static void main(String[]args){
	Circle c=new Circle(3);
	c.circumference();
	c.area();
}
}
class Circle{
	 double radius;
	 public Circle(double radius){
		 this.radius=radius;
	 }
	 public void circumference(){
		 double c=2*Math.PI*radius;
		 System.out.println("圆周长="+c);
	 }
	 public void area(){
		 double a=Math.PI*radius*radius;
		 System.out.println("圆面积="+a);
	 }
}