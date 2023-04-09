package 成员方法;
//成员方法快速入门
//1)添加 speak  成员方法,输出 “我是一个好人”
//2)添加 cal01  成员方法,可以计算从 1+2+..+1000 的结果
//3)添加 cal02  成员方法,该方法可以接收一个数 n，计算从 1+..+n 的结果
//4)添加 getSum 成员方法,可以计算两个数的和

public class Method01 {
public static void main(String[]args){
	Person p1=new Person();
	p1.speak();
    p1.cal01();
    p1.cal02(50);
    p1.getSum(1, 2);
    //把 方法 getSum 返回的值，赋给变量 res 
    int res=p1.getSum(10, 20);
    System.out.println("两个数的和="+res);
}
}
class Person{
	String name;
	int age;
	public void speak(){
		System.out.println("我是一个好人");
	}
	public void cal01(){
		int sum=0;
		for(int i=1;i<=1000;i++){
			sum=sum+i;
		}
		System.out.println("1+2+..+1000 的结果="+sum);
	}
	public void cal02(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println("1+..+n 的结果="+sum);
	}
	public int getSum(int n1,int n2){
		int n3=n1+n2;
		return n3;
		
	}
	
}