package ��ת�������break;

//1-100 ���ڵ�����ͣ�
// ѭ�� 1-100��ӣ� ���� ��һ�δ���20�ĵ�ǰ�� ��for + break��

public class BreakExercise1 {
public static void main(String[]args){
	int sum=0;
	for(int i=1;i<=100;i++){
		sum=sum+i;
		if(sum>20){
			System.out.println("��һ�δ���20�ĵ�ǰ��i=:"+i);
			break;
		}
	}
	
}
}
