package ����ѭ������;
import java.util.Scanner;
public class MulForExercise01 {
   //ͳ�� 3 ����ɼ������ÿ������ 5 ��ͬѧ������������ƽ���ֺ����а༶��ƽ����[ѧ���ĳɼ��Ӽ�������]��
   //ͳ�������༰��������ÿ������ 5 ��ͬѧ��
   public static void main(String[]args){
	   Scanner myScanner=new Scanner(System.in);
	   double sum2=0;
	   int count=0;
	  for(int i=1;i<=3;i++){
		  double sum1=0;//���ֵҲ��Ҫѭ����ÿ��ͳ����ÿ����ĺͺ����¹�0������Ҫ�����ѭ�����棬�ڲ�ѭ�����涨�塣
		  for(int j=1;j<=5;j++){
			  System.out.println("������"+i+"����ĵ�"+j+"��ѧ���ĳɼ�");
			  double score=myScanner.nextDouble();
			  sum1=sum1+score;
			  if(score>=60.0){
				  count++;
			  }
			  
		  }
		  System.out.println("��"+i+"�����ƽ����Ϊ:"+(sum1/5));
		  sum2=sum2+sum1;
		  
	  }
	   
	   System.out.println("3�����ƽ����Ϊ:"+(sum2/15));
	   System.out.println("3����ļ�������Ϊ:"+count);
	   
   }

}
