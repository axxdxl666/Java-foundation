package z�½ڼ��;

//��������Ϊ�������ݸ�������
// ��ĿҪ��
//��1������һ��Circle��
//    ����һ��double�͵�radius���Դ���Բ�İ뾶��findArea()��������Բ�����
//
//��2������һ����PassObject
//    �����ж���һ������printAreas����
//    �÷����Ķ������£�
//    public void printAreas(Circle c,int times) //����ǩ��/����
//
//��3����printAreas�����д�ӡ���1��times֮���ÿ�������뾶ֵ���Լ���Ӧ�����
//    ���磬timesΪ5��������뾶1��2��3��4��5���Լ���Ӧ��Բ���
//
//��4����main�����е���printAreas��������
//    ������Ϻ������ǰ�뾶ֵ��

public class zHomework13 {
public static void main(String[]args){
	Circle2 c=new Circle2();
	PassObject obj =new PassObject();
	obj.printAreas(c, 5);
}
}
class Circle2{
	double radius;
	 public double findArea(double radius){
		 double a=Math.PI*radius*radius;
		 return a;
	 }
}
class PassObject{
	public void printAreas(Circle2 c,int times){
		for(int i=1;i<=times;i++){
			c.radius=i;
			System.out.println("�뾶Ϊ:"+c.radius+"���Ϊ:"+c.findArea(c.radius));
		}
	}
}










