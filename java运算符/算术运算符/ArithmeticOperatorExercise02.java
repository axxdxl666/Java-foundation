package 算术运算符;
   //假如还有 59 天放假，问：合 xx 个星期零 xx 天
public class ArithmeticOperatorExercise02 {
	public static void main(String[]args){

		int days=59;
        System.out.println("合"+(days/7)+"个星期零"+(days%7)+"天");
	
	}
}
