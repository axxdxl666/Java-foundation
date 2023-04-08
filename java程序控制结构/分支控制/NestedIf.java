package 分支控制;
import java.util.Scanner;
    //嵌套分支
    //在一个分支结构中又完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外层分支。
    //老师建议: 不要超过 3 层 （可读性不好）

    //应用案例
    //参加歌手比赛，如果初赛成绩大于 8.0 进入决赛，否则提示淘汰。并且根据性别提示进入男子组或女子组。
    //【可以让学员先练习下】, 输入成绩和性别，进行判断和输出信息。[NestedIf.java]
    //提示: double score; char gender;
    //接收字符: char gender = scanner.next().charAt(0)
public class NestedIf {
       public static void main(String[]args){
    	   Scanner myScanner=new Scanner(System.in);
    	   System.out.println("请输入该歌手的成绩"); 
    	   double score=myScanner.nextDouble();
    	   if(score>8.0){
    		   System.out.println("请输入性别：");
    		   char gender =myScanner.next().charAt(0); 
    		  if(gender=='男'){
    			  System.out.println("进入男子组");
    		  }
    		  else if(gender=='女'){
    			  System.out.println("进入女子组");
    		  }
    		  else{
    			  System.out.println("进入奇葩组");
    		  }
    	   }
    	   else{
    		   System.out.println("你被淘汰");
    	   }
    	   
    	   
       }
   
}
