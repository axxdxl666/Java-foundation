package ��Ա����;

//�����С��С��ַ���ӡ ��Ӧ�������������ַ������磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��

public class MethodExercise02 {
public static void main(String[]args){
	 BB b=new BB();
	 b.print(4,4,'*');
}	
}

class BB{
	public void print(int row,int column,char c){
		for(int i=1;i<=column;i++){
			for(int j=1;j<=row;j++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}