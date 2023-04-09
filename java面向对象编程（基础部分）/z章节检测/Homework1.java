package z章节检测;

//编写类A，定义方法max，实现求某个double数组的最大值，并返回

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
	   System.out.println("数组的最大值="+m);
	   return m;
	}else{
		System.out.println("数组不能为空");
		return -1;
	}
	 
	}
}