package z�½ڼ��;

//��̴���һ��Cale������
//�����ж���2��������ʾ������������
//�����ĸ�����ʵ����͡���ˡ��̣�Ҫ�����Ϊ0�Ļ���Ҫ��ʾ��
//�������������󣬷ֱ����

public class Homework6 {
public static void main(String[]args){
	Cale c=new Cale(5,2);
	c.add();
	c.subtract();
	c.multiply();
	c.divide();
}
}
class Cale{
	double n1;
	double n2;
	public Cale(double n1,double n2){
		this.n1=n1;
		this.n2=n2;
	}
	public void add(){
		System.out.println("��="+(n1+n2));
	}
	public void subtract(){
		System.out.println("��="+(n1-n2));
	}
	public void multiply(){
		System.out.println("��="+(n1*n2));
	}
	public void divide(){
		if(n2==0){
			System.out.println("����������Ϊ0");
		}
		else{
		System.out.println("��="+(n1/n2));
		}
	}
	
}