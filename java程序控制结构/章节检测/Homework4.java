package �½ڼ��;
import java.util.Scanner;

//�ж�һ�������Ƿ���ˮ�ɻ���
//��νˮ�ɻ�����ָһ��3λ���������λ�����������͵����䱾��
//���磺153=1*1*1+3*3*3+5*5*5

public class Homework4 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("������һ����λ��:");
	int num=myScanner.nextInt();
	int onesplace=num%10;//num%100%10Ҳ����
	int tensplace=num%100/10;
	int hundredsplace=num/100;
	if(num==(onesplace*onesplace*onesplace)+(tensplace*tensplace*tensplace)+(hundredsplace*hundredsplace*hundredsplace)){
		System.out.println("�������ˮ�ɻ���");
	}
	else{
		System.out.println("���������ˮ�ɻ���");
	}
}
}
