package �½ڼ��;
//���1-1/2+1/3-1/4.....1/100�ĺ�
public class Homework8 {
public static void main(String[]args){
	double sum=0;
	for(int i=1;i<=100;i++){
	    if(i%2==0){
	    	sum=sum-1.0/i;
	    }
	    else{
	    	sum=sum+1.0/i;
	    }
	}
	System.out.println("1-1/2+1/3-1/4.....1/100�ĺ�Ϊ:"+sum);
	
}
}
