package ��֧����;
import java.util.Scanner;
     //   switch�����﷨
     // switch�����ʽ��{
     //        case ����1://����
     //        ����1;
     //        break;
     //        case ����2:
     //        ����2;
     //        break;
     //        ......
     //        case ����n:
     //        ����n;
     //        break;
     //        default:
     //        default����;
     //        break;
     //  }

	//�Ϻ����switch
	//1.switch�ؼ��֣���ʾswtich��֧
	//2.���ʽ��Ӧһ��ֵ
	//3.case����1�������ʽ��ֵ���ڳ���1����ִ������1
	//4.break;��ʾ�˳�swtich
	//5.�����case����1ƥ�䣬��ִ������1�����û��ƥ�䣬�ͼ���ƥ��case����2
	//6.���һ����û��ƥ���ϣ�ִ��default

    //��������
    //���дһ�����򣬸ó�����Խ���һ���ַ�������:a,b,c,d,e,f,g
    //a ��ʾ����һ��b ��ʾ���ڶ� ��
    //�����û���������ʾ��Ӧ����Ϣ.Ҫ��ʹ�� switch �����ɴ���

public class Switch01 {
    public static void main(String[]args){
    	Scanner myScanner=new Scanner(System.in);
    	System.out.println("�������ַ�:");
    	char c1= myScanner.next().charAt(0);
    	//�� java �У�ֻҪ����ֵ���أ�����һ�����ʽ
    	switch(c1){
    	       case 'a':
    	       System.out.println("a��ʾ����һ");
    	       break;
    	       case 'b':
    	       System.out.println("b��ʾ���ڶ�");
    	       break;
    	       case 'c':
    	       System.out.println("c��ʾ������");
    	       break;
    	       case 'd':
    	       System.out.println("d��ʾ������");
    	       break;
    	       case 'e':
    	       System.out.println("e��ʾ������");
    	       break;
    	       case 'f':
    	       System.out.println("f��ʾ������");
    	       break;
    	       case 'g':
    	       System.out.println("g��ʾ������");
    	       break;
    	       default:
    	       System.out.println("��������ַ���������������");
    	       break;
    	     	   
    	}
    	
    	
    }
}
