package ��֧����;
    //����֧
import java.util.Scanner;
    //�����﷨
    //if���������ʽ��{
    //   ִ�д����;�������ж������.��
    // }
    //˵�������������ʽΪtureʱ���ͻ�ִ��{}�Ĵ��롣���Ϊfalse���Ͳ�ִ��
    //�ر�˵������� {}��ֻ��һ����䣬����Բ���{}������ʦ����д��{}
    
public class If01 {
	//��дһ�� main ����
	public static void main(String[] args) {
	//��дһ������,���������˵�����,�����ͬ־��������� 18 ��,
	//����� "��������� 18,Ҫ���Լ�����Ϊ����,�������"
	//
	//˼·����
	//1. �������������,  Ӧ�ö���һ�� Scanner ����
	//2. �����䱣�浽һ������ int age
	//3. ʹ�� if �жϣ������Ӧ��Ϣ

	//Ӧ�ö���һ�� Scanner ����
	Scanner myScanner=new Scanner(System.in);
	System.out.println("����������");
	int age=myScanner.nextInt();
	if(age>18){
		System.out.println("��������� 18,Ҫ���Լ�����Ϊ����,�������");
	}
	System.out.println("�������.....");
}
}