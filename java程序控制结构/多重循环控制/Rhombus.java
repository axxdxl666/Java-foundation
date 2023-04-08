package 多重循环控制;

import java.util.Scanner;
//使用 for 循环完成下面的案例
//请编写一个程序，可以接收一个整数,表示层数（totalLevel），
//打印出空心菱形。[化繁为简, 先死后活]
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
	    System.out.println("请输入棱形的层数：");
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
