package �����ݹ����;

//���ӳ��������⣺
//��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ����
//�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����
//������10��ʱ�����ٳ�ʱ������û�ԣ�����ֻ��1�������ˡ�
//���⣺��������ٸ����ӣ�

public class RecursionExercise012 {
public static void main(String[]args){
	CC c=new CC();
	int day=1;
	int n=c.peach(day);
	System.out.println("��"+day+"����"+n+"������");
	
}
}

class CC{
	public int peach(int day){
		if(day==10){
			return 1;
		}
		if(day>=1&&day<=9){
			return (peach(day+1)+1)*2;
		}
		else{
			System.out.println("������1~10֮�������");
			return -1;
		}
	}
}