package z�½ڼ��;

//��д��A�����巽��max��ʵ����ĳ��double��������ֵ��������

public class Homework1 {
public static void main(String[]args){
	double [] arr={10.0,5.5,8.8,23.8};
	A a=new A();
	double max=a.max(arr);
}
}
class A{
	public double max(double[]arr){
	   if(arr!=null&&arr.length>0){
	   double m=0;
	   for(int i=0;i<arr.length;i++){
		   if(arr[i]>m){
			   m=arr[i];
		   }
	   }
	   System.out.println("��������ֵ="+m);
	   return m;
	}else{
		System.out.println("���鲻��Ϊ��");
		return -1;
	}
	 
	}
}