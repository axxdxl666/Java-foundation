package z�½ڼ��;
import java.util.Scanner;
//��д��Book�����巽��updatePrice
//ʵ�ָ���ĳ����ļ۸�
//���壺����۸�>150�������Ϊ150������۸�>100������Ϊ100�����򲻱�

public class Homework3 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("�������Ȿ��ļ۸�:");
	int price=myScanner.nextInt();
	Book b=new Book();
	int p=b.updatePrice(price);
	System.out.println("���ĺ�ļ۸�Ϊ"+p);
}
}
class Book{
	public int updatePrice(int price){
		if(price>150){
			price=150;
			return price;
		}
		if(price>100){
			price=100;
			return price;
		}
		else{
	         return price;
		}
	}
}