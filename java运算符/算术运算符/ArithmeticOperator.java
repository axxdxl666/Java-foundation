package 算术运算符;
  /**
   *演示算术运算符的使用
   */
public class ArithmeticOperator {
	//编写一个 main 方法
	public static void main(String[] args) {
	// / 的使用
	System.out.println(10 / 4); //从数学来看是 2.5, java 中 2，因为10/4运算结果是整数型
	System.out.println(10.0 / 4); //java 是 2.5，因为10.0/4运算结果是浮点型
	double d = 10 / 4;//java 中 10 / 4 = 2,但被double定义了所以精度自动提升变为2.0
	System.out.println(d);// 是 2.0
	
	//  % 取模 ,取余
	// 在 % 的本质 看一个公式!!!! 
	// a % b = a -(int) a / b * b
	// 注意：有小数运算时得到结果为近似值
	// -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
	// 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
	// -10 % -3 =	(-10) - (-10) / (-3) * (-3) = -10 + 9 = -1
	System.out.println(10 % 3); //1
	System.out.println(-10 % 3);//-1
	System.out.println(10 % -3);//1
	System.out.println(-10 % -3);//-1
	
	//++的使用
	//作为独立的语句使用：
	//前++和后++都完全等价于i=i+1；
	//作为表达式使用：
	//前++：++i先自增后赋值
	//后++：i++先赋值后自增
	int i = 10;
	i++;//自增 等价于 i = i + 1; => i = 11
	++i;//自增 等价于 i = i + 1; => i = 12
	System.out.println("i=" + i);//12
	
	/*
	作为表达式使用
	前++：++i 先自增后赋值后++：i++先赋值后自增
	*/
	int j = 8;
	//int k = ++j;//等价 j=j+1;k=j;
	int k = j++; // 等价 k =j;j=j+1;
	System.out.println("k=" + k + "j=" + j);//8 9
	
	
	
}
} 
