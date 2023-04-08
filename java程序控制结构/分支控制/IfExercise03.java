package 分支控制;
import java.util.Scanner;
     //出票系统：根据淡旺季的月份和年龄，打印票价【课后练习】
     //旺季(4~10月)：
     //    成人(18-60):60
     //    儿童（<18）：半价
     //    老人（>60）：1/3 
     //淡季：
     //    成人：40 
     //    其他：20

 //思路分析（1）淡旺季-if-else
 //      （2）在旺季中，可以使用多分支处理三种情况
 //      （3）在淡季情况，使用双分支处理即可

public class IfExercise03 {
     public static void main(String[]args){
    	 Scanner myScanner=new Scanner(System.in);
    	 System.out.println("请输入月份：");
         int month = myScanner.nextInt();
         if(month>=4&&month<=10){
        	 System.out.println("请输入年龄：");
        	 int age = myScanner.nextInt();
        	 if(age>0&&age<18){
        		 System.out.println("票价为30");
        	 }
        	 else if(age>=18&&age<=60){
        		 System.out.println("票价为60");
        	 }
        	 else if(age>60){
        		 System.out.println("票价为20");
        	 }
        	 else{
        		 System.out.println("你输入的年龄有误，请重新输入");
        	 }
         }
         else if((month>0&&month<4)||(month>10&&month<=12)){
        	 System.out.println("请输入年龄：");
        	 int age = myScanner.nextInt();
        	 if(age>=18){
        		 System.out.println("票价为40");
        	 }
        	 else if(age>=1&&age<18){
        		 System.out.println("票价为20");
        	 }
        	 else{
        		 System.out.println("你输入的年龄有误，请重新输入");
        	 }
         }
         else{
        	 System.out.println("你输入的月份有误，请重新输入");
         }
     }
}
