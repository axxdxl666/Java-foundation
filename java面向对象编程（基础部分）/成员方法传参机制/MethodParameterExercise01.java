package 成员方法传参机制;

//成员方法返回类型是引用类型应用实例
//1)编写类 MyTools 类，编写一个方法可以打印二维数组的数据。
//2)编写一个方法 copyPerson，可以复制一个 Persons 对象，返回复制的对象。
//  克隆对象， 注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
public class MethodParameterExercise01 {
public static void main(String[]args){
	//编写一个方法 copyPerson，可以复制一个 Person 对象，返回复制的对象。克隆对象，
	//注意要求得到新对象和原来的对象是两个独立的对象，只是他们的属性相同
	//
	//编写方法的思路
	//1. 方法的返回类型 Person
	//2. 方法的名字 copyPerson
	//3. 方法的形参 (Person p)
	//4. 方法体, 创建一个新对象，并复制属性，返回即可
	
	Person2 p = new Person2();
	p.name = "milan";
	p.age = 100;
	//创建 tools
	MyTools tools = new MyTools(); 
	Person2 p2 = tools.copyPerson(p);

	//到此 p  和 p2 是 Person 对象，但是是两个独立的对象，属性相同
	System.out.println("p 的属性 age=" + p.age	+ "  名字=" + p.name);
	System.out.println("p2 的属性 age=" + p2.age	+ "  名字=" + p2.name);
	
	
}
}
class MyTools{
	public void print(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public Person2 copyPerson(Person2 p){
		//创建一个新的对象
		Person2 p2 = new Person2();

        p2.name=p.name;//把原来对象的姓名赋给 p2.name
		p2.age = p.age; //把原来对象的年龄赋给 p2.age 
		return p2;
	}
}
class Person2{
	String name;
	int age;
}