package 查找;
import java.util.Scanner;
//顺序查找案例演示：
//有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王猜数游戏：
//从键盘中任意输入一个名称，判断数列中是否包含此名称【顺序查找】 
//要求: 如果找到了，就提示找到，并给出下标值。

public class SeqSearch {
public static void main(String[]args){
	String[] names={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
	Scanner myScanner=new Scanner(System.in);
	System.out.print("请输入你要查找的名称：");
	String findName=myScanner.next();
	int index=-1;
	for(int i=0;i<names.length;i++){
		if(findName.equals(names[i])){
			System.out.println("恭喜你找到"+findName);
			System.out.println("下标为"+i);
			index=i;
			break;
		}
	}
	if(index==-1){
			System.out.println("没有找到");
		}
}
}
