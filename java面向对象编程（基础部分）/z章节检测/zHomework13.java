package z章节检测;

//将对象作为参数传递给方法。
// 题目要求：
//（1）定义一个Circle类
//    包含一个double型的radius属性代表圆的半径，findArea()方法返回圆的面积
//
//（2）定义一个类PassObject
//    在类中定义一个方法printAreas（）
//    该方法的定义如下：
//    public void printAreas(Circle c,int times) //方法签名/声明
//
//（3）在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
//    例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积
//
//（4）在main方法中调用printAreas（）方法
//    调用完毕后输出当前半径值。

public class zHomework13 {
public static void main(String[]args){
	Circle2 c=new Circle2();
	PassObject obj =new PassObject();
	obj.printAreas(c, 5);
}
}
class Circle2{
	double radius;
	 public double findArea(double radius){
		 double a=Math.PI*radius*radius;
		 return a;
	 }
}
class PassObject{
	public void printAreas(Circle2 c,int times){
		for(int i=1;i<=times;i++){
			c.radius=i;
			System.out.println("半径为:"+c.radius+"面积为:"+c.findArea(c.radius));
		}
	}
}










