package 程序中加号的使用;

public class text1 {
	public static  void main(String[]args){
		   /*   1，当左右两边都为数值型时做加法运算
		    *   2，当左右两边有一方为字符串，则做拼接运算
		    */
		   System.out.println(100+3);//输出103
		   System.out.println("100"+3);//输出1003
		   System.out.println("hello"+100+3);//输出hello1003
		   System.out.println(100+3+"hello");//输出103hello
}
}