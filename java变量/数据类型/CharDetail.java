package ��������;

public class CharDetail {
	public static void main(String[]args){
    	//��java�У�char�ı�����һ����������Ĭ������У���Unicode���Ӧ���ַ�
		//Ҫ����ַ�����Ӧ�����ֿ��ԣ�int���ַ�
		char c1=97;
		System.out.println(c1);//���a����Ϊ��97��unicode��ASCII����ж�Ӧ����ĸ��a
		//Unicode�����0-127���ַ���ASCII�ı�����һ���ģ�Unicode�����ASCII��
		char c2='a';
		System.out.println((int)c2);//����ַ�'a'�ڱ�����ж�Ӧ������97
		char c3='��';
	    System.out.println((int)c3);//����ַ�'��'�ڱ�����ж�Ӧ������38889
		char c4=38889;
		System.out.println(c4);//���38889�ڱ�����ж�Ӧ���ַ�'��'
		//char�����ǿ��Խ�������ģ��൱��һ����������Ϊ�����ж�Ӧ��Unicode��
		System.out.println('a'+10);//���107
		//���ò���
		char c5='b'+1;//b��Ӧ����98������b+1=99
		System.out.println((int)c5);//���99
		System.out.println(c5);//����99��Ӧ���ַ�'c'
      }
      //�ַ��Ĵ洢��'a'==����ֵ97==�������ƣ�1100001��==���洢
      //�ַ��Ķ�ȡ��������==��97==��'a'==����ʾ
}
