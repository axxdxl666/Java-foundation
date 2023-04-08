package 算术运算符;
    //定义一个变量保存华氏温度
    //华氏温度转换摄氏温度的公式为：5/9*(华氏温度-100)
    //请求出华氏温度对应的摄氏温度。(234.6)
    //考虑数学公式和 java 语言的特性
public class ArithmeticOperatorExercise03 {
	public static void main(String[]args){
		
		double huashi=234.6;
		double sheshi=5.0/9*(huashi-100);//5要变成5.0，因为5/9在java中结果为0
		System.out.println("华氏温度" + huashi+ "对应的摄氏温度=" + sheshi);
		
	}
}
