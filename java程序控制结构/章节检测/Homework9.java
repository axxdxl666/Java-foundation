package �½ڼ��;

//��1+(1+2)+(1+2+3)+��1+2+3+4��+��+��1+2+3+.+100���Ľ��
//˫��ѭ��

public class Homework9 {
public static void main(String[]args){
	int sum2=0;
	for(int i=1;i<=100;i++){
		int sum1=0;//Ҫע���д����ѭ������
		for(int j=1;j<=i;j++){
			sum1=sum1+j;
		}
		sum2=sum2+sum1;
	}
	System.out.println("1+(1+2)+(1+2+3)+��1+2+3+4��+��+��1+2+3+.+100���Ľ��Ϊ:"+sum2);
}
}