package ��Ԫ�����;
      //1) ���ʽ 1 �ͱ��ʽ 2 ҪΪ���Ը������ձ���������(������Զ�ת��)
      //2) ��Ԫ���������ת�� if--else ���
      //int res = a > b ?	a++ :	--b;
      //if ( a > b) res = a++;
      //else res = --b;
public class TernaryOperatorDetail {
	// ��дһ�� main ����
	public static void main(String[] args) {
	//  ���ʽ 1 �ͱ��ʽ 2 ҪΪ���Ը������ձ���������
	//  (������Զ�ת��/����ǿ��ת��) 
		int a = 3;
	    int b = 8;
	    int c = a > b ? (int)1.1 : (int)3.4;//���Ե�
	    double d = a > b ? a : b + 3;//���Եģ����� int -> double
	}
}
