package z�½ڼ��;
import java.util.Scanner;
//��д��B�� ���巽��find�� ʵ�ֲ���ĳ�ַ����Ƿ����ַ��������У���������������Ҳ���������-1

public class Homework2 {
public static void main(String[]args){
	
	
	String[] arr={"С��","С��","С��"};
	B b=new B();
	int x=b.find(arr);
	System.out.println("��������="+x);
}
}
class B{
	public int find(String[]arr){
		Scanner myScanner=new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ��ַ���:");
	    String s=myScanner.next();
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(s)){   
				System.out.println("���ַ������ַ���������");
			    return i;
			}	 
		}
		{
			    System.out.println("���ַ��������ַ���������");
				return -1;
			}
		
	}
}