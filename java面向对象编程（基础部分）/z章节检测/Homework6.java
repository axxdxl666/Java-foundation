package z章节检测;

//编程创建一个Cale计算类
//在其中定义2个变量表示两个操作数，
//定义四个方法实现求和、差、乘、商（要求除数为0的话，要提示）
//并创建两个对象，分别测试

public class Homework6 {
public static void main(String[]args){
	Cale c=new Cale(5,2);
	c.add();
	c.subtract();
	c.multiply();
	c.divide();
}
}
class Cale{
	double n1;
	double n2;
	public Cale(double n1,double n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void add(){
		System.out.println("和="+(n1+n2));
	}
	public void subtract(){
		System.out.println("差="+(n1-n2));
	}
	public void multiply(){
		System.out.println("乘="+(n1*n2));
	}
	public void divide(){
		if(n2==0){
			System.out.println("除数不可以为0");
		}
		else{
		System.out.println("商="+(n1/n2));
		}
	}
	
}