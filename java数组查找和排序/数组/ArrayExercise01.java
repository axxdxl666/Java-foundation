package 数组;

//创建一个 char 类型的 26 个元素的数组，分别 放置'A'-'Z'。
//使用 for 循环访问所有元素并打印出来。
//提示：char 类型数据运算 'A'+1 -> 'B'

public class ArrayExercise01 {
public static void main(String[]args){
	char c1[]=new char[26];
	char c2='A';
	for(int i=0;i<c1.length;i++){	
		System.out.println(c2);
		c2++;
	}
}
}
