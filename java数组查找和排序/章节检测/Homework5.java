package 章节检测;

//随机生成10个整数（1~100的范围）保存到数组，
//并倒序打印以及求平均值、求最大值和最大值的下标，并查找里面是否有8

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
	System.out.println("平均值为:"+arrAvg);
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
			System.out.println("该数组含有8");
			break;
		}
		
	}if(index==-1){
			System.out.println("该数组不含有8");
		}
	System.out.println("最大值为:"+max+"下标为:"+count);
	
}
}
