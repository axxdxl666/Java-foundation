package �������;

//���Ե�ע�������ϸ��˵����
//1)���ԵĶ����﷨ͬ����,ʾ��:�������η�  ��������  ������; 
//  ����򵥵Ľ��ܷ������η��� �������Եķ��ʷ�Χ
//  �����ַ������η� public, proctected, Ĭ��, private ,
//2)���ԵĶ������Ϳ���Ϊ��������,�����������ͻ���������
//  �����������ֵ����Ĭ��ֵ�����������һ�¡�
//  ����˵: int   0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000�� boolean false��String null
public class PropertiesDetail {
	public static void main(String[] args) {
		//���� Person ����
		//p1 �Ƕ�����(��������)
		//new Person() �����Ķ���ռ�(����) ���������Ķ���
		Person p1 = new Person();

		//���������Ĭ��ֵ�������������:
		//int	0��short 0, byte 0, long 0, float 0.0,double 0.0��char \u0000��boolean false��String null

		System.out.println("\n ��ǰ����˵���Ϣ");
		System.out.println("age=" + p1.age + " name="	+ p1.name + " sal=" + p1.salary + " isPass=" + p1.isPass) ;
		}
		}


  	class Person {
		//�ĸ�����
		int age; 
		String name;
		double salary;
		boolean isPass;
}
