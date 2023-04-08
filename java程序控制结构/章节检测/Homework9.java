package 章节检测;

//求1+(1+2)+(1+2+3)+（1+2+3+4）+…+（1+2+3+.+100）的结果
//双层循环

public class Homework9 {
public static void main(String[]args){
	int sum2=0;
	for(int i=1;i<=100;i++){
		int sum1=0;//要注意别写到外循环外面
		for(int j=1;j<=i;j++){
			sum1=sum1+j;
		}
		sum2=sum2+sum1;
	}
	System.out.println("1+(1+2)+(1+2+3)+（1+2+3+4）+…+（1+2+3+.+100）的结果为:"+sum2);
}
}