package 成员方法传参机制;

//引用数据类型的传参机制
//引用类型传递的是地址（传递也是值，但是值是地址），可以通过形参影响实参！


//B 类中编写一个方法 test100，可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化？会变化
//B 类中编写一个方法test200，可以接收一个 Person(age,sal)对象，在方法中修改该对象属性，看看原来的对象是否变

public class MethodParameter02 {
public static void main(String[]args){
	int[] arr={1,2,3};
	BB b=new BB();
	b.test100(arr);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	Person p = new Person();
	p.name = "jack";
	p.age = 10;
	b.test200(p);
	System.out.println("main 的 p.age=" + p.age);
}
}
class BB{
	public void test100(int arr[]){
		arr[0]=100;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void test200(Person p){
		p.age=20;
		p.name = "tom";
		
	}
}
class Person{
	int age;
	String name;
}