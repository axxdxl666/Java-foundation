package z章节检测;

//试写出以下代码的运行结果

public class zHomework10 {
	public static void main(String[] args){
		Demo d1=new Demo();
		Demo d2=d1;
		d2.m();
		System.out.println(d1.i);
		System.out.println(d2.i);
	}
}
class Demo{
	int i=100;
	public void m (){
		int j=i++;//先赋值后自增
		System.out.println("i="+i);//101
		System.out.println("j="+j);//100
    }
}
//输出结果为
// i=101
// j=100
// 101
// 101