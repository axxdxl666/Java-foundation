package ����ѭ������;
import java.util.Scanner;
//ʹ�� for ѭ���������İ���
//���дһ�����򣬿��Խ���һ������,��ʾ������totalLevel����
//��ӡ����������[����Ϊ��, �������]
//     *
//    ***
//   *****
//  *******
public class Pyramid1 {
    public static void main(String[] args) {
    Scanner myScanner=new Scanner(System.in);
    System.out.println("������������Ĳ�����");
    int totalLevel=myScanner.nextInt();
    for(int i=1;i<=totalLevel;i++){
    	for(int k = 1; k <= totalLevel - i; k++ ) { 
    		System.out.print(" ");
    	}  	 
    	for(int j = 1; j <= 2 * i - 1; j++ ) {
    		System.out.print("*");
    	}
    	System.out.println("");
    	 }
    }
}
  
 