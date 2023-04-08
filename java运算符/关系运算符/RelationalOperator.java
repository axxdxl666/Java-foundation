package 关系运算符;
  //关系运算符的结果都是 boolean 型，也就是要么是 true，要么是 false。
  //关系运算符组成的表达式，我们称为关系表达式。 a > b
  //比较运算符"=="不能误写成"="
public class RelationalOperator {
	public static void main(String[] args) {

		int a = 9;	//老韩提示:开发中，不可以使用a, b
		int b = 8;
		System.out.println(a > b); //T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//T
		System.out.println("flag=" + flag);
}
}
