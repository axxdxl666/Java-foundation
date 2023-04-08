package 基本数据类型和String类型的转换;
   //基本类型转String类型
   //语法：将基本类型的值+" "即可
   //String类型转基本数据类型
   //语法：通过基本类型的包装类调用parseXX方法即可
   
   //注意事项
   //1：在将 String类型转成 基本数据类型时，要确保String类型可以转换成有效的数据
   //  比如 我们可以把 "123" , 转成一个整数，但是不能把 "hello" 转成一个整数
   //2：如果格式不正确，就会抛出异常，程序就会终止， 这个问题在异常处理章节中，会处理

   
public class StringToBasic {
	//编写一个 main 方法
	public static void main(String[] args) {
	//基本数据类型->String
	int n1 = 100;
	float f1 = 1.1F;
	double d1 = 4.5;
	boolean b1 = true;
	String s1 = n1 + "";
	String s2 = f1 + "";
	String s3 = d1 + ""; 
	String s4 = b1 + "";
	System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
	
	//String->对应的基本数据类型
	String s5 = "123";
	//会在 OOP 讲对象和方法的时候回详细
	//解读 使用 基本数据类型对应的包装类，的相应方法，得到基本数据类型
	int num1 = Integer.parseInt(s5);
	double num2 = Double.parseDouble(s5);
	float num3 = Float.parseFloat(s5);
	long num4 = Long.parseLong(s5);
	byte num5 = Byte.parseByte(s5);
	boolean b = Boolean.parseBoolean("true");
	short num6 = Short.parseShort(s5);
	
	System.out.println("===================");
	System.out.println(num1);//123 
	System.out.println(num2);//123.0
	System.out.println(num3);//123.0
	System.out.println(num4);//123 
	System.out.println(num5);//123 
	System.out.println(num6);//123 
	System.out.println(b);//true

	
	
	
	
	

}
}