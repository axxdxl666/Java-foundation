package ��Ԫ�����;
    //  �������ʽ ? ���ʽ 1: ���ʽ 2;
    //  �������
    //  ����������ʽΪ true�������Ľ���Ǳ��ʽ 1��
    //  ����������ʽΪ false�������Ľ���Ǳ��ʽ 2�� 

public class TernaryOperator {
	//��дһ�� main ����
	public static void main(String[] args) {

	int a = 10; int b = 99;
	// ���
	// 1. a > b Ϊ false
	// 2.  ���� b--, �ȷ��� b ��ֵ,Ȼ���� b-1
	// 3. ���صĽ���� 99
	
	int result= a>b ? a++: b--;
	System.out.println("result=" + result);//99
	System.out.println("a=" + a);
	System.out.println("b=" + b);

	}  
}
