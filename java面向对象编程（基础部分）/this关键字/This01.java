package this�ؼ���;

//ʲô��this
//java��������ÿ���������this������ǰ����

//thisС��
//�򵥵�˵���Ǹ�������ã�this�ʹ����Ǹ�����

//���⣺
//���췽����������������Ƿǳ��ĺã�����ܹ���dName�ĳ�name�ͺ��ˣ�
//�������ǻᷢ�ְ��ձ�����������ԭ��name��ֵ����null��
//��ô���->this

//ʹ��this���ǰ�������������
public class This01 {
public static void main(String[]args){
	Dog dog1=new Dog("����",3);
	Dog dog2=new Dog("С��",5);
	dog1.info();
	System.out.println("dog1.hashCode=" + dog1.hashCode());
	System.out.println();
	dog2.info();
	System.out.println("dog2.hashCode=" + dog2.hashCode());
	
}
}
class Dog{ 
	String name; 
    int age;
    public Dog(String name, int age){
        this.name = name;
     	this.age = age;
 }
    public void info(){
        System.out.println("this.hashCode=" + this.hashCode());//�ɶ���ĵ�ַ�õ��Ĺ�ϣ��������ԵĿ��ɸö���ĵ�ַ
        System.out.println(name + "\t" + age + "\t");
    }
}
