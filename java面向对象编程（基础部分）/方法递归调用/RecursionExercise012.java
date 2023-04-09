package 方法递归调用;

//猴子吃桃子问题：
//有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
//以后每天猴子都吃其中的一半，然后再多吃一个，
//当到第10天时，想再吃时（即还没吃）发现只有1个桃子了。
//问题：最初共多少个桃子？

public class RecursionExercise012 {
public static void main(String[]args){
	CC c=new CC();
	int day=1;
	int n=c.peach(day);
	System.out.println("第"+day+"天有"+n+"个桃子");
	
}
}

class CC{
	public int peach(int day){
		if(day==10){
			return 1;
		}
		if(day>=1&&day<=9){
			return (peach(day+1)+1)*2;
		}
		else{
			System.out.println("请输入1~10之间的天数");
			return -1;
		}
	}
}