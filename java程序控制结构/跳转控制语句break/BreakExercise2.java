package 跳转控制语句break;
import java.util.Scanner;
// 实现登录验证，有 3 次机会，如果用户名为"丁真" ,密码"666"提示登录成功，否则提示还有几次机会，
// 请使用 for+break完成

public class BreakExercise2 {
public static void main(String[]args){
	for( int i = 1; i <= 3; i++){
	Scanner myScanner=new Scanner(System.in);   
	System.out.println("请输入用户名:");
	String name=myScanner.next();
	System.out.println("请输入密码:");
	String password=myScanner.next();
    //补充说明字符串 的内容 比较 使用的 方法 equals
	if("丁真".equals(name)&&"666".equals(password)){
		System.out.println("恭喜你登录成功!");
		break;
	}
	else{
		System.out.println("你还有"+(3-i)+"次机会");
	}
	}
	
}
}
