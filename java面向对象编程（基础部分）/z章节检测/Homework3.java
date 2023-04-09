package z章节检测;
import java.util.Scanner;
//编写类Book，定义方法updatePrice
//实现更改某本书的价格
//具体：如果价格>150，则更改为150，如果价格>100，更改为100，否则不变

public class Homework3 {
public static void main(String[]args){
	Scanner myScanner=new Scanner(System.in);
	System.out.println("请输入这本书的价格:");
	int price=myScanner.nextInt();
	Book b=new Book();
	int p=b.updatePrice(price);
	System.out.println("更改后的价格为"+p);
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