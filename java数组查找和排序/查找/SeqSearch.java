package ����;
import java.util.Scanner;
//˳����Ұ�����ʾ��
//��һ�����У���üӥ������ëʨ����������������������������Ϸ��
//�Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ� 
//Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ��

public class SeqSearch {
public static void main(String[]args){
	String[] names={"��üӥ��","��ëʨ��","��������","��������"};
	Scanner myScanner=new Scanner(System.in);
	System.out.print("��������Ҫ���ҵ����ƣ�");
	String findName=myScanner.next();
	int index=-1;
	for(int i=0;i<names.length;i++){
		if(findName.equals(names[i])){
			System.out.println("��ϲ���ҵ�"+findName);
			System.out.println("�±�Ϊ"+i);
			index=i;
			break;
		}
	}
	if(index==-1){
			System.out.println("û���ҵ�");
		}
}
}
