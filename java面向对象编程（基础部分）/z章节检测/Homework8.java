package z�½ڼ��;

//����һ��Java����Ĵ���������ʾ��
//��������к��������ǣ�10,9,10,11��

public class Homework8 {
        int count=9;
	public void count1(){
		count=10;
	    System.out.println("count1="+count++);
	}
	public void count2(){
		System.out.println("count1="+count++);//�����������
	}
	public static void main(String args[]){
		//new Homework8()����������ֻ�ܵ���һ�Σ�������ͱ�����
		new Homework8().count1();
		Homework8 t1= new Homework8();
		t1.count2();
		t1.count2();
		//��Ϊcount2�����е��õ�count�ǳ�Ա����,��������Ȼ����,��������count2���������걻����
		System.out.println(t1.count);
	}
}
