package 循环控制;

//打印 40—200 之间所有的偶数[使用 while]

public class WhileExercise2 {
  public static void main(String[]args){
	  int i=40;
	  while(i<=200){
		  if(i%2==0){
			  System.out.println(i);
		  }
		  i++;
	  }
  }
}
