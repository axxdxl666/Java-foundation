package 成员方法;

//访问修饰符 (作用是控制 方法使用的范围)
//如果不写默认访问，[有四种: public, protected, 默认, private],  具体在后面说

//返回数据类型
//1)一个方法最多有一个返回值	[思考，如何返回多个结果 返回数组 ]
//2)返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
//3)如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
//  而且要求返回值类型必须和 return 的值类型一致或兼容
//4)如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ;

//方法名
//遵循驼峰命名法，最好见名知义，表达出该功能的意思即可, 比如 得到两个数的和	getSum, 开发中按照规范

//形参列表
//1.一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开，比如getSum（int n1,int n2）
//2.参数类型可以为任意类型，包含基本类型或引用类型，比如printArr（int[]map）
//3.调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型的参数！[getSum]
//4.方法定义时的参数称为形式参数，简称形参；方法调用时的传入参数称为实际参数，简称实参
//  实参和形参的类型要一致或兼容、个数、顺序必须一致！

//方法体
//里面写完成功能的具体的语句，可以为输入、输出、变量、运算、分支、循环、方法调用，
//方法里面不能再定义方法！即：方法不能嵌套定义。


public class MethodDetail {
public static void main(String[] args) {
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);

		//细节: 调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数
		byte b1 = 1; byte b2 = 2;
		a.getSumAndSub(b1, b2);//byte -> int
		//a.getSumAndSub(1.1, 1.8);//double ->int(×)
		//细节: 实参和形参的类型要一致或兼容、个数、顺序必须一致
        //a.getSumAndSub(100);//× 个数不一致
        a.f3("tom", 10); //ok
        //a.f3(100, "jack"); //  实际参数和形式参数顺序不对
}
}
class AA {
//细节: 方法不能嵌套定义
public void f4() {
//错误
//public void f5() {
//	}
}
public void f3(String str, int n) {

}
//1. 一个方法最多有一个返回值	[思考，如何返回多个结果 返回数组 ] 
public int[] getSumAndSub(int n1, int n2) {
		int[] resArr = new int[2]; 
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2; 
		return resArr;
		
		}
		//2. 返回类型可以为任意类型，包含基本类型或引用类型(数组，对象)
        //具体看 getSumAndSub

		//3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return 值;
		//	  而且要求返回值类型必须和 return 的值类型一致或兼容
public double f1() {
		double d1 = 1.1 * 3; 
		int n = 100;
		return n; // int ->double
		//return d1; //ok? double -> int
		}
		//如果方法是 void，则方法体中可以没有 return 语句，或者 只写 return ;
		//老韩提示：在实际工作中，我们的方法都是为了完成某个功能，所以方法名要有一定含义
		//，最好是见名知意
		public void f2() {
		System.out.println("hello1"); 
		System.out.println("hello1"); 
		System.out.println("hello1");
		int n = 10;
		//return ;
}
}