package ��Ա�������λ���;

//�����������͵Ĵ��λ���
//�������ʹ��ݵ��ǵ�ַ������Ҳ��ֵ������ֵ�ǵ�ַ��������ͨ���β�Ӱ��ʵ�Σ�


//B ���б�дһ������ test100�����Խ���һ�����飬�ڷ������޸ĸ����飬����ԭ���������Ƿ�仯����仯
//B ���б�дһ������test200�����Խ���һ�� Person(age,sal)�����ڷ������޸ĸö������ԣ�����ԭ���Ķ����Ƿ��

public class MethodParameter02 {
public static void main(String[]args){
	int[] arr={1,2,3};
	BB b=new BB();
	b.test100(arr);
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	Person p = new Person();
	p.name = "jack";
	p.age = 10;
	b.test200(p);
	System.out.println("main �� p.age=" + p.age);
}
}
class BB{
	public void test100(int arr[]){
		arr[0]=100;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void test200(Person p){
		p.age=20;
		p.name = "tom";
		
	}
}
class Person{
	int age;
	String name;
}