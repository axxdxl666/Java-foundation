package ��֧����;
import java.util.Scanner;
     //��Ʊϵͳ�����ݵ��������·ݺ����䣬��ӡƱ�ۡ��κ���ϰ��
     //����(4~10��)��
     //    ����(18-60):60
     //    ��ͯ��<18�������
     //    ���ˣ�>60����1/3 
     //������
     //    ���ˣ�40 
     //    ������20

 //˼·������1��������-if-else
 //      ��2���������У�����ʹ�ö��֧�����������
 //      ��3���ڵ��������ʹ��˫��֧������

public class IfExercise03 {
     public static void main(String[]args){
    	 Scanner myScanner=new Scanner(System.in);
    	 System.out.println("�������·ݣ�");
         int month = myScanner.nextInt();
         if(month>=4&&month<=10){
        	 System.out.println("���������䣺");
        	 int age = myScanner.nextInt();
        	 if(age>0&&age<18){
        		 System.out.println("Ʊ��Ϊ30");
        	 }
        	 else if(age>=18&&age<=60){
        		 System.out.println("Ʊ��Ϊ60");
        	 }
        	 else if(age>60){
        		 System.out.println("Ʊ��Ϊ20");
        	 }
        	 else{
        		 System.out.println("�������������������������");
        	 }
         }
         else if((month>0&&month<4)||(month>10&&month<=12)){
        	 System.out.println("���������䣺");
        	 int age = myScanner.nextInt();
        	 if(age>=18){
        		 System.out.println("Ʊ��Ϊ40");
        	 }
        	 else if(age>=1&&age<18){
        		 System.out.println("Ʊ��Ϊ20");
        	 }
        	 else{
        		 System.out.println("�������������������������");
        	 }
         }
         else{
        	 System.out.println("��������·���������������");
         }
     }
}
