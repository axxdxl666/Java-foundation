package ��Ա�������λ���;

//��Ա����������������������Ӧ��ʵ��
//1)��д�� MyTools �࣬��дһ���������Դ�ӡ��ά��������ݡ�
//2)��дһ������ copyPerson�����Ը���һ�� Persons ���󣬷��ظ��ƵĶ���
//  ��¡���� ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
public class MethodParameterExercise01 {
public static void main(String[]args){
	//��дһ������ copyPerson�����Ը���һ�� Person ���󣬷��ظ��ƵĶ��󡣿�¡����
	//ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���ֻ�����ǵ�������ͬ
	//
	//��д������˼·
	//1. �����ķ������� Person
	//2. ���������� copyPerson
	//3. �������β� (Person p)
	//4. ������, ����һ���¶��󣬲��������ԣ����ؼ���
	
	Person2 p = new Person2();
	p.name = "milan";
	p.age = 100;
	//���� tools
	MyTools tools = new MyTools(); 
	Person2 p2 = tools.copyPerson(p);

	//���� p  �� p2 �� Person ���󣬵��������������Ķ���������ͬ
	System.out.println("p ������ age=" + p.age	+ "  ����=" + p.name);
	System.out.println("p2 ������ age=" + p2.age	+ "  ����=" + p2.name);
	
	
}
}
class MyTools{
	public void print(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public Person2 copyPerson(Person2 p){
		//����һ���µĶ���
		Person2 p2 = new Person2();

        p2.name=p.name;//��ԭ��������������� p2.name
		p2.age = p.age; //��ԭ����������丳�� p2.age 
		return p2;
	}
}
class Person2{
	String name;
	int age;
}