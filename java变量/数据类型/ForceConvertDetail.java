package 数据类型;
    //强制类型转换细节说明
    //当进行数据的大小从大->小就需要强制转换
    //强制转换符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    //char类型可以保存int的常量值但不能保存int的变量值需要强转
    //byte和shot类型在进行运算时当做int类型处理

public class ForceConvertDetail {
	  public static void main(String[]args){
    // int x=(int)10*3.5+6*1.5;//错误，因为该int只对最近的10有效，运算结果仍为double型不能赋值给int
	   int x =(int)(10*3.5+6*1.5);//正确（int）44.0->44
	   System.out.println(x);//输出44
	   
	   char c1=100;//正确
	   int m=100;//正确
	   //char c2=m;//错误，m被定义为int型变量不能赋值给char型
	   char c3=(char)m;//大->强转没有问题
	   System.out.println(c3);//输出100对应的字符'd'
}
	  
	  
	  
	  
	  
	  
}
