package �½ڼ��;

//�������10��������1~100�ķ�Χ�����浽���飬
//�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±꣬�����������Ƿ���8

public class Homework5 {
public static void main(String[]args){
	int[] arr=new int[10];
	int sum=0;
	for(int i=0;i<arr.length;i++){
		arr[i]=(int)(Math.random()*100);
	}
	for(int i=arr.length-1;i>=0;i--){
		System.out.println(arr[i]);
		sum=sum+arr[i];
	}
	double arrAvg=sum/10.0;
	System.out.println("ƽ��ֵΪ:"+arrAvg);
	int max=0;
	int count=0;
	int index=-1;
	for(int i=0;i<arr.length;i++){
		if(arr[i]>max){
			max=arr[i];
			count=i;
		}
		if(arr[i]==8){
			index=i;
			System.out.println("�����麬��8");
			break;
		}
		
	}if(index==-1){
			System.out.println("�����鲻����8");
		}
	System.out.println("���ֵΪ:"+max+"�±�Ϊ:"+count);
	
}
}
