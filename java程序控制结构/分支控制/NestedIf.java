package ��֧����;
import java.util.Scanner;
    //Ƕ�׷�֧
    //��һ����֧�ṹ����������Ƕ������һ�������ķ�֧�ṹ������ķ�֧�Ľṹ��Ϊ�ڲ��֧����ķ�֧�ṹ��Ϊ����֧��
    //��ʦ����: ��Ҫ���� 3 �� ���ɶ��Բ��ã�

    //Ӧ�ð���
    //�μӸ��ֱ�������������ɼ����� 8.0 ���������������ʾ��̭�����Ҹ����Ա���ʾ�����������Ů���顣
    //��������ѧԱ����ϰ�¡�, ����ɼ����Ա𣬽����жϺ������Ϣ��[NestedIf.java]
    //��ʾ: double score; char gender;
    //�����ַ�: char gender = scanner.next().charAt(0)
public class NestedIf {
       public static void main(String[]args){
    	   Scanner myScanner=new Scanner(System.in);
    	   System.out.println("������ø��ֵĳɼ�"); 
    	   double score=myScanner.nextDouble();
    	   if(score>8.0){
    		   System.out.println("�������Ա�");
    		   char gender =myScanner.next().charAt(0); 
    		  if(gender=='��'){
    			  System.out.println("����������");
    		  }
    		  else if(gender=='Ů'){
    			  System.out.println("����Ů����");
    		  }
    		  else{
    			  System.out.println("����������");
    		  }
    	   }
    	   else{
    		   System.out.println("�㱻��̭");
    	   }
    	   
    	   
       }
   
}
