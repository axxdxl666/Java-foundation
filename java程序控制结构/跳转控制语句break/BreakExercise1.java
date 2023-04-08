package 跳转控制语句break;

//1-100 以内的数求和，
// 循环 1-100相加， 当和 第一次大于20的当前数 【for + break】

public class BreakExercise1 {
public static void main(String[]args){
	int sum=0;
	for(int i=1;i<=100;i++){
		sum=sum+i;
		if(sum>20){
			System.out.println("第一次大于20的当前数i=:"+i);
			break;
		}
	}
	
}
}
