package ��Ա����;

//��Ա�����ĺô�
//1)��ߴ���ĸ�����
//2)���Խ�ʵ�ֵ�ϸ�ڷ�װ������Ȼ�������û������ü���

//��Ա�����Ķ���
//�������η� ������������ ���������β��б�..�� 
//  {
//    ���������;
//    return ����ֵ; 
//}
//1)�β��б���ʾ��Ա�������� cal(int n) �� getSum(int num1, int num2)
//2)�����������ͣ���ʾ��Ա�������, void ��ʾû�з���ֵ
//3)�������壺��ʾΪ��ʵ��ĳһ���ܴ����
//4)return ��䲻�Ǳ���ġ�

//��һ������
//�����һ������ , �������ĸ���Ԫ��ֵ��
//int [][] map ={{0,0,1},{1,1,1},{1,1,3}};
//���˼· 1����ͳ�ķ���������ʹ�õ��� for ѭ�����������������ҿ���������ʲô��
//���˼· 2: ����һ���� MyTools ,Ȼ��дһ����Ա���������÷���ʵ��,����Ч������Ρ�

public class Method02 {
public static void main(String[]args){
	int[][] map={{0,0,1},{1,1,1},{1,1,3}};
	MyTools tool=new MyTools();
	tool.print(map);
}
}
class MyTools{
	
	public void print(int map[][]){
	for(int i=0;i<map.length;i++){
		for(int j=0;j<map[i].length;j++){
			System.out.print(map[i][j]+" ");
		}
		System.out.println("");
	  }
   }
}