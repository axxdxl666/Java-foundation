package ��֧����;
import java.util.Scanner;
		//��ѧ���ɼ����� 60 �ֵģ����"�ϸ�"������ 60 �ֵģ�
		//���"���ϸ�"��(ע������ĳɼ����ܴ��� 100), ��ʾ �ɼ�/60

		//˼·����
		//1. ����⣬����ʹ�� ��֧����ɣ� ����Ҫ��ʹ�� switch
		//2. ����������Ҫ����һ��ת��, ���˼· :
		//	����ɼ��� [60,100] , (int)(�ɼ�/60) = 
		//	����ɼ��� [0,60) , (int)(�ɼ�/60) = 0
    
public class SwitchExercise1 {
	public static void main(String[]args){
     Scanner myScanner=new Scanner(System.in);
     System.out.println("������ѧ���ɼ���");
     int score=myScanner.nextInt();
     if(score>=0&&score<=100){
    	 switch((int)(score/60)){
    	             case 1:
    	                 System.out.println("�ɼ��ϸ�");
    	                 break;
    	             case 0:
    	            	 System.out.println("�ɼ����ϸ�");
    	            	 break;
    	             default:
    	            	 System.out.println("����������������������");
    	            	 break;
    	 }
     }
     else{
    	 System.out.println("���������0-100");
     }
     
	}
}
