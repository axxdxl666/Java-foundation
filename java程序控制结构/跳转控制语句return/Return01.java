package ��ת�������return;

//returnһ��ʹ���ڷ���,��ʾ�������ڵķ���,���ʹ����main�����б�ʾ�˳�����
//�ڽ��ⷽ����ʱ�򣬻���ϸ�Ľ��ܣ��������Ǽ򵥵���һ��

public class Return01 {
public static void main(String[]args){
	for(int i=1;i<=5;i++){
		if(i==3){
			System.out.println("java~~");
			//break;
			//continue;
			return;
		}
		System.out.println("hello world!");
	}
	System.out.println("go on..");
}
}
