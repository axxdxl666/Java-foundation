package 章节检测;

//某人有100，000元，每经过一次路口，需要交费，规则如下：
//1）当现金>50000时，每次交5%
//2）当现金<=50000时，每次交1000
//编程计算该人可以经过多少次路口
//要求：使用while+break方式完成

public class Homework1 {
public static void main(String[]args){
	double cash=100000;
	int count=0;
	while(true){
		if(cash>50000){
			cash=cash*0.95;
			count++;
			
		}
		else if(cash>=1000&&cash<=50000){
			cash=cash-1000;
			count++;
		}
		else if(cash<1000){
			break;
		}
	}
	System.out.println("该人可以经过"+count+"次路口");
}
}
