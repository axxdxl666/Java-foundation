package ��Ա����;

//��д�� AA ����һ���������ж�һ���������� odd ����ż��,  ���� boolean

public class MethodExercise01 {
public static void main(String[]args){
	AAA a=new AAA();
	boolean n=a.isOdd(9);
	System.out.println(n);
	// if(a.isOdd(2)) {//T ,  ������д���Ժ�ῴ���ܶ�
    //    System.out.println("������");
	// } else {
    //	 System.out.println("��ż��");}
}
}
class AAA{
	public boolean isOdd(int n){
		if(n%2==0){
			return false;
		}
		else{
			return true;
		}
		//����ʡ�Գ�һ�仰return num % 2 != 0;
	}
}