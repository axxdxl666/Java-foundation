package ����ѭ������;

import java.util.Scanner;
//ʹ�� for ѭ���������İ���
//���дһ�����򣬿��Խ���һ������,��ʾ������totalLevel����
//��ӡ���������Ρ�[����Ϊ��, �������]
//   *
//  * *
// *   *
//*     *
// *   *
//  * *
//   *

public class Rhombus {
	public static void main(String[] args){
		Scanner myScanner=new Scanner(System.in);
	    System.out.println("���������εĲ�����");
	    int totalLevel=myScanner.nextInt();
		for(int i = 1 ; i <= (int)(totalLevel/2)+1 ; i++){
			for(int k = 1 ; k <=(int)(totalLevel/2)+1 - i ; k++){
				System.out.print(" ");
			}
			for(int j = 1 ; j <= 2 * i - 1 ;j++){
				if(j == 1 || j == 2 * i - 1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		
		for(int i = 1 ; i <= totalLevel/2 ; i++){
			for(int k = 1 ; k <= i ; k++){
				System.out.print(" ");
			}
			                                                                                                                                                                                                                    
			for(int j = 1 ; j <=(totalLevel) - 2 * i ; j++){
				if(j == 1 || j == (totalLevel) - 2* i){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println("");
		}
		
		
	}
}
