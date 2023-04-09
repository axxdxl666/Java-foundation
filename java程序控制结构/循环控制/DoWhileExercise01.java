package  循环控制;

public class DoWhileExercise01 {
	 //编写一个 main 方法
     public static void main(String[]args){
    	 int i=1;
    	 int sum=0;
    	 do{
    		 sum=sum+i;
    		 i++;
    	 }while(i<=100);
    	 System.out.println(sum);
     }
}
