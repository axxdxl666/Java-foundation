package �½ڼ��;
import java.util.Scanner;
//ʵ���ж�һ�������������ĸ���Χ��
//����0��С��0������0
//˼·��ʹ��if--else if--else����

public class Homework2 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("������һ������:");
	int x=myScanner.nextInt();
	if(x==0){
		System.out.println("���������0");
	}
	else if(x<0){
		System.out.println("�����С��0");
	}
	else{
		System.out.println("���������0");
	}
}
}
