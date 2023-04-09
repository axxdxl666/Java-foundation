package 成员方法;

//编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数,  返回 boolean

public class MethodExercise01 {
public static void main(String[]args){
	AAA a=new AAA();
	boolean n=a.isOdd(9);
	System.out.println(n);
	// if(a.isOdd(2)) {//T ,  这样的写法以后会看到很多
    //    System.out.println("是奇数");
	// } else {
    //	 System.out.println("是偶数");}
}
}
class AAA{
	public boolean isOdd(int n){
		if(n%2==0){
			return false;
		}
		else{
			return true;
		}
		//可以省略成一句话return num % 2 != 0;
	}
}