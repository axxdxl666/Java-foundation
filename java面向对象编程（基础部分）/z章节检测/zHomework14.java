package z�½ڼ��;
import java.util.Scanner;
import java.util.Random;
//��չ��
//�и���Tom������ĳ�Ա����.��Ա���������Ե��Բ�ȭ
//����ÿ�ζ����������0��1��2
//0��ʾʯͷ  1��ʾ����   2��ʾ��
//��Ҫ������ʾTom����Ӯ�������嵥��

public class zHomework14 {
public static void main(String[]args){
	Fingerguessing f=new Fingerguessing();
	f.guessing();
}
}
class Fingerguessing{
	int finger;
	public void guessing(){
		int count=0;
	  while(true){
		  Scanner myScanner=new Scanner(System.in);
		  System.out.println("�����������Ҫ��ʲô:");
		  int myfinger=myScanner.nextInt();
		  if(myfinger==6){
			  System.out.println("���˳�����Ϸ");
			  break;
		  }
		  int robotfinger=(int)(Math.random()*3);
		  System.out.println("��������γ�����:"+robotfinger);
		  if((myfinger==0&&robotfinger==1)||(myfinger==1&&robotfinger==2)||(myfinger==2&&robotfinger==0)){
			  System.out.println("��Ӯ��");
			  count=count+1;
			  System.out.println("��ĿǰӮ��"+count+"��");
		  }
		  if(myfinger==robotfinger){
			  System.out.println("ƽ��");
			  System.out.println("��ĿǰӮ��"+count+"��");
		  }else{
			  System.out.println("������");
			  System.out.println("��ĿǰӮ��"+count+"��");
		  }
		  
		  if(myfinger!=0&&myfinger!=1&&myfinger!=2){
			  System.out.println("��������ȷ������");
		  }
		  
		  
	  }
	}
}