package ��ת�������continue;

         //ϸ�ڰ���������˵��
public class ContinueDetail {
public static void main(String[]args){	
	label1:
		for(int j = 0; j < 4; j++){ label2:
		for(int i = 0; i < 10; i++){ if(i == 2){
		//�����ֱ����ʲôֵ��������
		//continue ;
		//continue label2; 
		continue label1;
		}
		System.out.println("i = " + i);
		}
     }
}		
}
