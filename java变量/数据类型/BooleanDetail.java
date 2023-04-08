package 数据类型;

public class BooleanDetail {
      //布尔类型也叫boolean类型，boolean类型数据只允许取值true和false，无null
	  //boolean类型占1个字节
	  //boolean类型适用于逻辑运算，一般用于流程控制如if条件控制语句，while循环控制语句，for循环控制语句，do-while循环控制语句等等
	  public static void main(String[]args){
		  //判断成绩是否通过的案例
		  boolean isPass=false;//定义一个布尔变量
		  if(isPass==true){
			  System.out.println("考试通过");
		  }else{
			  System.out.println("考试没有通过");
		  }
	  }
}
