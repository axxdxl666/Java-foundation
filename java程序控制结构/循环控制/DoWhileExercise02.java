package ѭ������;
    
public class DoWhileExercise02 {
	 //ͳ�� 1---200 ֮���ܱ� 5 ���������ܱ� 3 �����ĸ���
	 public static void main(String[]args){
		 int i=1;
		 int count=0;
		 do{
			 if(i%3!=0&&i%5==0){
				 count++;
			 }
			 i++;
		 }while(i<=200);
		 System.out.println(count);
	 }
}
