package �ɱ����;

//����������
//�ֱ�ʵ��
//�������������ſγɼ����ܷ֣���
//�������������ſγɼ����ܷ֣���
//�������������ſγɼ����ܷ֣���
//��װ��һ���ɱ�����ķ���
//���� HspMethod ������ showScore �β�(String ,double... )
//���� String

public class VarParameterExercise {
public static void main(String[]args){
	HspMethods obj=new HspMethods();
	System.out.println(obj.showScore("milan" , 90.1, 80.0 ));
	System.out.println(obj.showScore("terry" , 90.1, 80.0,10,30.5,70 ));
}
}
class HspMethods{
	public String showScore(String name,double...nums){
		 double sum=0;
		for(int i=0;i<nums.length;i++){
			sum=sum+nums[i];
		}
		return name+"��"+nums.length + "�ſεĳɼ��ܷ�Ϊ="+sum;
	}
}