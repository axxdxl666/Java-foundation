package 分支控制;
import java.util.Scanner;
		//对学生成绩大于 60 分的，输出"合格"。低于 60 分的，
		//输出"不合格"。(注：输入的成绩不能大于 100), 提示 成绩/60

		//思路分析
		//1. 这道题，可以使用 分支来完成， 但是要求使用 switch
		//2. 这里我们需要进行一个转换, 编程思路 :
		//	如果成绩在 [60,100] , (int)(成绩/60) = 
		//	如果成绩在 [0,60) , (int)(成绩/60) = 0
    
public class SwitchExercise1 {
	public static void main(String[]args){
     Scanner myScanner=new Scanner(System.in);
     System.out.println("请输入学生成绩：");
     int score=myScanner.nextInt();
     if(score>=0&&score<=100){
    	 switch((int)(score/60)){
    	             case 1:
    	                 System.out.println("成绩合格");
    	                 break;
    	             case 0:
    	            	 System.out.println("成绩不合格");
    	            	 break;
    	             default:
    	            	 System.out.println("分数输入有误，请重新输入");
    	            	 break;
    	 }
     }
     else{
    	 System.out.println("输入分数在0-100");
     }
     
	}
}
