package 分支控制;
   //对下列代码，若有输出，指出输出结果
public class IfExercise01 {
	public static void main(String[] args){
	   int x=7;
	   int y=4;
	   if(x>5){
		   if(y>5){
			   System.out.println(x+y);
		   }
		       System.out.println("666");
	   }
	   else{
		   System.out.println("x is "+x);
	   }
}
}
//输出结果为666