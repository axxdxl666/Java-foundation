package �����ݹ����;

//��ʹ�õݹ�ķ�ʽ���쳲�������1��1��2��3��5��8��13��
//����һ������n���������ֵ�Ƕ�

public class RecursionExercise01 {
public static void main(String[]args){
	BB b=new BB();	
	int n=b.fibonacci(6);
	System.out.println(n);
}
}
class BB{
	public int fibonacci(int n){
		if(n<=2){
			return 1;
		}
		if(n>2){		
			
			return fibonacci(n-1)+fibonacci(n-2);
			
			}
		else {
			System.out.println("Ҫ������� n>=1 ������");
			return -1;
			}
			
		
	}
}