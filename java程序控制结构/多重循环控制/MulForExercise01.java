package 多重循环控制;
import java.util.Scanner;
public class MulForExercise01 {
   //统计 3 个班成绩情况，每个班有 5 名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
   //统计三个班及格人数，每个班有 5 名同学。
   public static void main(String[]args){
	   Scanner myScanner=new Scanner(System.in);
	   double sum2=0;
	   int count=0;
	  for(int i=1;i<=3;i++){
		  double sum1=0;//这个值也需要循环，每次统计玩每个班的和后重新归0，所以要在外层循环里面，内层循环外面定义。
		  for(int j=1;j<=5;j++){
			  System.out.println("请数第"+i+"个班的第"+j+"个学生的成绩");
			  double score=myScanner.nextDouble();
			  sum1=sum1+score;
			  if(score>=60.0){
				  count++;
			  }
			  
		  }
		  System.out.println("第"+i+"个班的平均分为:"+(sum1/5));
		  sum2=sum2+sum1;
		  
	  }
	   
	   System.out.println("3个班的平均分为:"+(sum2/15));
	   System.out.println("3个班的及格人数为:"+count);
	   
   }

}
