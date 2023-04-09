package this关键字;

//什么是this
//java虚拟机会给每个对象分配this，代表当前对象

//this小结
//简单地说，那个对象调用，this就代表那个对象

//问题：
//构造方法的输入参数名不是非常的好，如果能够将dName改成name就好了，
//但是我们会发现按照变量的作用域原则，name的值就是null，
//怎么解决->this

//使用this解决前面变量命名问题
public class This01 {
public static void main(String[]args){
	Dog dog1=new Dog("旺财",3);
	Dog dog2=new Dog("小白",5);
	dog1.info();
	System.out.println("dog1.hashCode=" + dog1.hashCode());
	System.out.println();
	dog2.info();
	System.out.println("dog2.hashCode=" + dog2.hashCode());
	
}
}
class Dog{ 
	String name; 
    int age;
    public Dog(String name, int age){
        this.name = name;
     	this.age = age;
 }
    public void info(){
        System.out.println("this.hashCode=" + this.hashCode());//由对象的地址得到的哈希数可以相对的看成该对象的地址
        System.out.println(name + "\t" + age + "\t");
    }
}
