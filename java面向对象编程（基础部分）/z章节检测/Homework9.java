package z�½ڼ��;

//����Music��
//������������name������ʱ��times����
//���в���play���ܺͷ��ر���������Ϣ�Ĺ��ܷ���getlnfo.

public class Homework9 {
public static void main(String[]args){
	Music m=new Music("happy",180);
	m.play();
	m.getlnfo();
}
}
class Music{
	String name;
	int times;
	public Music(String name,int times){
		this.name=name;
		this.times=times;
	}
	public void play(){
		System.out.println("����"+name+" "+"���ڲ�����");
	}
	public void getlnfo(){
		System.out.println("������"+name+" "+"����ʱ��"+times+"��");
	}
}