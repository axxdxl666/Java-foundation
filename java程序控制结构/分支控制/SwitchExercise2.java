package ��֧����;
import java.util.Scanner;
		//��������ָ���·ݣ�
		//��ӡ���·������ļ��ڡ�
		//3,4,5 ���� 6,7,8  �ļ�  9,10,11 �＾ 12, 1, 2  ����
		//[������ϰ, ��ʾ ʹ�ô�͸ ]
		//
		//˼·����
		//1. ���� Scanner ���� �����û�����
		//2. ʹ�� int month ����
		//3. ʹ�� switch  ��ƥ�� ,ʹ�ô�͸����ɣ��Ƚϼ��
public class SwitchExercise2 {
      public static void main(String[]args){
    	  Scanner myScanner=new Scanner(System.in);
    	  System.out.println("�������·�:");
    	  int month=myScanner.nextInt();
    	  switch(month){
    	  case 3:
    	  case 4:
    	  case 5:
    		  System.out.println("����´��ڴ���");
    		  break;
    	  case 6:
    	  case 7:
    	  case 8:
    		  System.out.println("����´����ļ�");
    		  break;
    	  case 9:
    	  case 10:
    	  case 11:
    		  System.out.println("����´����＾");
    		  break;
    	  case 12:
    	  case 1:
    	  case 2:
    		  System.out.println("����´��ڶ���");
    		  break;
    	  default:
    		  System.out.println("��������·���������������");
    		  break;
    	  }
      }
}
