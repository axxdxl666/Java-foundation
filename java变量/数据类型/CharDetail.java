package 数据类型;

public class CharDetail {
	public static void main(String[]args){
    	//在java中，char的本质是一个整数，在默认输出中，是Unicode码对应的字符
		//要输出字符所对应的数字可以（int）字符
		char c1=97;
		System.out.println(c1);//输出a，因为在97在unicode和ASCII码表中对应的字母是a
		//Unicode编码表0-127的字符与ASCII的编码是一样的，Unicode码兼容ASCII码
		char c2='a';
		System.out.println((int)c2);//输出字符'a'在编码表中对应的数字97
		char c3='韩';
	    System.out.println((int)c3);//输出字符'韩'在编码表中对应的数字38889
		char c4=38889;
		System.out.println(c4);//输出38889在编码表中对应的字符'韩'
		//char类型是可以进行运算的，相当于一个整数，因为它都有对应的Unicode码
		System.out.println('a'+10);//输出107
		//课堂测试
		char c5='b'+1;//b对应数字98，所以b+1=99
		System.out.println((int)c5);//输出99
		System.out.println(c5);//数出99对应的字符'c'
      }
      //字符的存储：'a'==》码值97==》二进制（1100001）==》存储
      //字符的读取：二进制==》97==》'a'==》显示
}
