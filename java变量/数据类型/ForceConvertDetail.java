package ��������;
    //ǿ������ת��ϸ��˵��
    //���������ݵĴ�С�Ӵ�->С����Ҫǿ��ת��
    //ǿ��ת������ֻ���������Ĳ�������Ч��������ʹ��С�����������ȼ�
    //char���Ϳ��Ա���int�ĳ���ֵ�����ܱ���int�ı���ֵ��Ҫǿת
    //byte��shot�����ڽ�������ʱ����int���ʹ���

public class ForceConvertDetail {
	  public static void main(String[]args){
    // int x=(int)10*3.5+6*1.5;//������Ϊ��intֻ�������10��Ч����������Ϊdouble�Ͳ��ܸ�ֵ��int
	   int x =(int)(10*3.5+6*1.5);//��ȷ��int��44.0->44
	   System.out.println(x);//���44
	   
	   char c1=100;//��ȷ
	   int m=100;//��ȷ
	   //char c2=m;//����m������Ϊint�ͱ������ܸ�ֵ��char��
	   char c3=(char)m;//��->ǿתû������
	   System.out.println(c3);//���100��Ӧ���ַ�'d'
}
	  
	  
	  
	  
	  
	  
}
