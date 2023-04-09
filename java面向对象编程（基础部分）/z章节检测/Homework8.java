package z章节检测;

//给定一个Java程序的代码如下所示，
//则编译运行后，输出结果是（10,9,10,11）

public class Homework8 {
        int count=9;
	public void count1(){
		count=10;
	    System.out.println("count1="+count++);
	}
	public void count2(){
		System.out.println("count1="+count++);//先输出后自增
	}
	public static void main(String args[]){
		//new Homework8()是匿名对象，只能调用一次，调用完就被销毁
		new Homework8().count1();
		Homework8 t1= new Homework8();
		t1.count2();
		t1.count2();
		//因为count2方法中调用的count是成员变量,自增完仍然存在,不会随着count2方法调用完被销毁
		System.out.println(t1.count);
	}
}
