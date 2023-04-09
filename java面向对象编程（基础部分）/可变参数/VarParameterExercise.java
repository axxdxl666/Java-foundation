package 可变参数;

//有三个方法
//分别实现
//返回姓名和两门课成绩（总分），
//返回姓名和三门课成绩（总分），
//返回姓名和五门课成绩（总分）。
//封装成一个可变参数的方法
//类名 HspMethod 方法名 showScore 形参(String ,double... )
//返回 String

public class VarParameterExercise {
public static void main(String[]args){
	HspMethods obj=new HspMethods();
	System.out.println(obj.showScore("milan" , 90.1, 80.0 ));
	System.out.println(obj.showScore("terry" , 90.1, 80.0,10,30.5,70 ));
}
}
class HspMethods{
	public String showScore(String name,double...nums){
		 double sum=0;
		for(int i=0;i<nums.length;i++){
			sum=sum+nums[i];
		}
		return name+"有"+nums.length + "门课的成绩总分为="+sum;
	}
}