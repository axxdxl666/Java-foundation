package 三元运算符;
    //  条件表达式 ? 表达式 1: 表达式 2;
    //  运算规则：
    //  如果条件表达式为 true，运算后的结果是表达式 1；
    //  如果条件表达式为 false，运算后的结果是表达式 2； 

public class TernaryOperator {
	//编写一个 main 方法
	public static void main(String[] args) {

	int a = 10; int b = 99;
	// 解读
	// 1. a > b 为 false
	// 2.  返回 b--, 先返回 b 的值,然后在 b-1
	// 3. 返回的结果是 99
	
	int result= a>b ? a++: b--;
	System.out.println("result=" + result);//99
	System.out.println("a=" + a);
	System.out.println("b=" + b);

	}  
}
