package 赋值运算符;
    //基本赋值运算符 =	int a = 10;
    //复合赋值运算符
    //+= ，-= ，*= ， /= ，%= 等 ,重点讲解一个 +=,其它的使用是一个道理
    //a += b;   [等价 a = a + b;]
    //a -= b;	[等价 a = a - b;]

    //1)运算顺序从右往左	int	num =a + b + c;
    //2)赋值运算符的左边 只能是变量,右边 可以是变量、表达式、常量值
    //int num = 20; int num2= 78 * 34 - 10; int num3 = a;
    //3)复合赋值运算符等价于下面的效果比如：a+=3;等价于 a=a+3;  其他类推
    //4)复合赋值运算符会进行类型转换
    //byte b = 2; b+=3; b++;
public class AssignOperator {
	//编写一个 main 方法
	public static void main(String[] args) {


	int n1 = 10;
	n1 += 4;// n1 = n1 + 4;
	System.out.println(n1); // 14
	n1 /= 3;// n1 = n1 / 3;//4 
	System.out.println(n1); // 4

	//复合赋值运算符会进行类型转换
	byte b = 3; 
	b += 2; // 等价 b = (byte)(b + 2);
	b++; // b = (byte)(b+1);
	}
	
}
