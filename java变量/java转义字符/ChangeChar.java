package java转义字符;
public class ChangeChar {
 public static  void main(String[]args){
	 System.out.println("张三\t李四\t王五"); // \t实现对齐 功能
	 System.out.println("张三\n李四\n王五"); // \n实现换行功能
	 System.out.println("张三\\李四\\王五"); // \\表示输出一个\
	 System.out.println("张三\"李四\"王五"); // \"表示输出一个"
	 System.out.println("张三\'李四\'王五"); // \'表示输出一个'
	 System.out.println("张三\r李四\r王五"); // \r实现回车的功能
	 //p21 课堂练习 
	 System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
	 
 }
}
