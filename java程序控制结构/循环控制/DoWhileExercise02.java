package 循环控制;
    
public class DoWhileExercise02 {
	 //统计 1---200 之间能被 5 整除但不能被 3 整除的个数
	 public static void main(String[]args){
		 int i=1;
		 int count=0;
		 do{
			 if(i%3!=0&&i%5==0){
				 count++;
			 }
			 i++;
		 }while(i<=200);
		 System.out.println(count);
	 }
}
