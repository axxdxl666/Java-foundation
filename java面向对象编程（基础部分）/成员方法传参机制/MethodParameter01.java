package ��Ա�������λ���;

//�����������͵Ĵ��λ���
//������������,���ݵ���ֵ��ֵ������,�βε��κθı䲻Ӱ��ʵ�Σ�

//��һ���������������ʲô
public class MethodParameter01 {
public static void main(String[]args){
	int a=10;
	int b=20;
	AA obj=new AA();
	obj.swap(10,20);
	System.out.println("\nmain ���� a=" + a + " b=" + b);
	//a=10 b=20,��Ϊswap��a��b�Ľ�����Ӱ���������е�a��b,��Ȼ����һ����������Ӱ�죬������ͬ
}
}
class AA{
	public void swap(int a,int b){
		System.out.println("\na �� b ����ǰ��ֵ\na=" + a + "\tb=" + b);//a=10 b=20
		int temp=a;
		    a=b;
		    b=a;
		System.out.println("\na �� b �������ֵ\na=" + a + "\tb=" + b);//a=20 b=10
	}
}