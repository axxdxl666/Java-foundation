package 跳转控制语句return;

//return一般使用在方法,表示跳出所在的方法,如果使用在main方法中表示退出程序
//在讲解方法的时候，会详细的介绍，这里我们简单的提一下

public class Return01 {
public static void main(String[]args){
	for(int i=1;i<=5;i++){
		if(i==3){
			System.out.println("java~~");
			//break;
			//continue;
			return;
		}
		System.out.println("hello world!");
	}
	System.out.println("go on..");
}
}
