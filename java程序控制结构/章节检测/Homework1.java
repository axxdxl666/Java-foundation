package �½ڼ��;

//ĳ����100��000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
//1�����ֽ�>50000ʱ��ÿ�ν�5%
//2�����ֽ�<=50000ʱ��ÿ�ν�1000
//��̼�����˿��Ծ������ٴ�·��
//Ҫ��ʹ��while+break��ʽ���

public class Homework1 {
public static void main(String[]args){
	double cash=100000;
	int count=0;
	while(true){
		if(cash>50000){
			cash=cash*0.95;
			count++;
			
		}
		else if(cash>=1000&&cash<=50000){
			cash=cash-1000;
			count++;
		}
		else if(cash<1000){
			break;
		}
	}
	System.out.println("���˿��Ծ���"+count+"��·��");
}
}
