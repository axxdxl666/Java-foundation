package ����;

//����һ�� char ���͵� 26 ��Ԫ�ص����飬�ֱ� ����'A'-'Z'��
//ʹ�� for ѭ����������Ԫ�ز���ӡ������
//��ʾ��char ������������ 'A'+1 -> 'B'

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
