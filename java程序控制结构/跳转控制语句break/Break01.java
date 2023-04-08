package 跳转控制语句break;
//break基本介绍：
//break 语句用于终止某个语句块的执行，一般使用在 switch 
//或者循环[for , while , do-while]中

//break基本语法：
// { ……
//   break;
//   ……
// }


public class Break01 {
	//快速入门==
  public static void main(String[]args){
	  for(int i=1;i<10;i++){
		  if(i==3){
			  break;
		  }
		  System.out.println("i="+i);
	  }
	  System.out.println("退出for循环，继续执行程序");
  }
}
