package z章节检测;
import java.util.Scanner;
import java.util.Random;
//扩展题
//有个人Tom设计他的成员变量.成员方法，可以电脑猜拳
//电脑每次都会随机生成0，1，2
//0表示石头  1表示剪刀   2表示布
//并要可以显示Tom的输赢次数（清单）

public class zHomework14 {
public static void main(String[]args){
	Fingerguessing f=new Fingerguessing();
	f.guessing();
}
}
class Fingerguessing{
	int finger;
	public void guessing(){
		int count=0;
	  while(true){
		  Scanner myScanner=new Scanner(System.in);
		  System.out.println("请输入你这次要出什么:");
		  int myfinger=myScanner.nextInt();
		  if(myfinger==6){
			  System.out.println("你退出了游戏");
			  break;
		  }
		  int robotfinger=(int)(Math.random()*3);
		  System.out.println("机器人这次出的是:"+robotfinger);
		  if((myfinger==0&&robotfinger==1)||(myfinger==1&&robotfinger==2)||(myfinger==2&&robotfinger==0)){
			  System.out.println("你赢了");
			  count=count+1;
			  System.out.println("你目前赢了"+count+"次");
		  }
		  if(myfinger==robotfinger){
			  System.out.println("平局");
			  System.out.println("你目前赢了"+count+"次");
		  }else{
			  System.out.println("你输了");
			  System.out.println("你目前赢了"+count+"次");
		  }
		  
		  if(myfinger!=0&&myfinger!=1&&myfinger!=2){
			  System.out.println("请输入正确的数字");
		  }
		  
		  
	  }
	}
}