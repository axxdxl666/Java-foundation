package �½ڼ��;
import java.util.Scanner;

//�ж�һ������Ƿ�Ϊ����
//����������Ƿ����������֮һ��
//(1)����ܱ� 4 �����������ܱ� 100 ������
//(2)�ܱ� 400����

public class Homework3 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("���������:");
	int year=myScanner.nextInt();
	if((year%4==0&&year%100!=0)||year%400==0){
		 System.out.println(year + " �� ����");
	}
	else{
		 System.out.println(year + "  ���� ����");
	}
}
}