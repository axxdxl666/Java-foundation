package ��ϵ�����;
  //��ϵ������Ľ������ boolean �ͣ�Ҳ����Ҫô�� true��Ҫô�� false��
  //��ϵ�������ɵı��ʽ�����ǳ�Ϊ��ϵ���ʽ�� a > b
  //�Ƚ������"=="������д��"="
public class RelationalOperator {
	public static void main(String[] args) {

		int a = 9;	//�Ϻ���ʾ:�����У�������ʹ��a, b
		int b = 8;
		System.out.println(a > b); //T
		System.out.println(a >= b);//T
		System.out.println(a <= b);//F
		System.out.println(a < b);//F
		System.out.println(a == b);//F
		System.out.println(a != b);//T
		boolean flag = a > b;//T
		System.out.println("flag=" + flag);
}
}
