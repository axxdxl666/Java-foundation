package �ɱ����;

////ע�������ʹ��ϸ��
//1���ɱ������ʵ�ο���Ϊ0������������
//2���ɱ������ʵ�ο���Ϊ���顣
//3���ɱ�����ı��ʾ�������.
//4���ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
//5��һ���β��б���ֻ�ܳ���һ���ɱ����


public class VarParameterDetail {
public static void main(String[]args){
	int[] arr = {1, 2, 3}; 
	A t1 = new A(); 
	//ϸ��: �ɱ������ʵ�ο���Ϊ����
	t1.f1(arr);
}
}
class A{
	public void f1(int...nums){
		System.out.println("����=" + nums.length);
	}
	
	//ϸ��: �ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б������뱣֤�ɱ���������
	public void f2(String str,double...nums){
		
	}
	
	//ϸ��: һ���β��б���ֻ�ܳ���һ���ɱ����
	//�����д���Ǵ��.
	// public void f3(int... nums1, double... nums2) {
    //
	// }
}