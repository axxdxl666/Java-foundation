package ��ת�������break;
import java.util.Scanner;
// ʵ�ֵ�¼��֤���� 3 �λ��ᣬ����û���Ϊ"����" ,����"666"��ʾ��¼�ɹ���������ʾ���м��λ��ᣬ
// ��ʹ�� for+break���

public class BreakExercise2 {
public static void main(String[]args){
	for( int i = 1; i <= 3; i++){
	Scanner myScanner=new Scanner(System.in);   
	System.out.println("�������û���:");
	String name=myScanner.next();
	System.out.println("����������:");
	String password=myScanner.next();
    //����˵���ַ��� ������ �Ƚ� ʹ�õ� ���� equals
	if("����".equals(name)&&"666".equals(password)){
		System.out.println("��ϲ���¼�ɹ�!");
		break;
	}
	else{
		System.out.println("�㻹��"+(3-i)+"�λ���");
	}
	}
	
}
}
