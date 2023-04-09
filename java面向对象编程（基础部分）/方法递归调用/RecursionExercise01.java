package 方法递归调用;

//请使用递归的方式求出斐波那契数1，1，2，3，5，8，13…
//给你一个整数n，求出它的值是多

public class RecursionExercise01 {
public static void main(String[]args){
	BB b=new BB();	
	int n=b.fibonacci(6);
	System.out.println(n);
}
}
class BB{
	public int fibonacci(int n){
		if(n<=2){
			return 1;
		}
		if(n>2){		
			
			return fibonacci(n-1)+fibonacci(n-2);
			
			}
		else {
			System.out.println("要求输入的 n>=1 的整数");
			return -1;
			}
			
		
	}
}