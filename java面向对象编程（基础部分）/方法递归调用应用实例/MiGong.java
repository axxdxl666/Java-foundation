package �����ݹ����Ӧ��ʵ��;

//�ݹ����Ӧ��ʵ��-�Թ�����
//ͼ��PPT
//1��С��õ���·�����ͳ���Ա���õ���·������
//  �ؼ�:��·���������ҵ�˳�����
//2.�ٵõ�С��·��ʱ��������ʹ��(��������)��
//  �ٸĳ�(��������)������·���ǲ����б仯
//3.���Ի�������
//4.��չ˼��:���������·��?

public class MiGong {
public static void main(String[]args){
	//1. �ȴ����Թ����ö�ά�����ʾ int[][] map = new int[8][7];
	//2. �ȹ涨 map  �����Ԫ��ֵ: 0  ��ʾ������ 1  ��ʾ�ϰ���
	int[][] map=new int[8][7];
	for(int i=0;i<map.length;i++){
		for(int j=0;j<map[i].length;j++){
			map[0][j]=1;
			map[7][j]=1;
			map[i][0]=1;
			map[i][6]=1;
			map[3][1]=1;
			map[3][2]=1;
			
		}
	}
	System.out.println("=====��ʼ��ͼ���======");
	for(int i = 0; i < map.length; i++) {
		for(int j = 0; j < map[i].length; j++) { 
			System.out.print(map[i][j] + " ");//���һ��
		}
		System.out.println();
		}
      A a=new A();
      a.findWay(map,1,1);
      System.out.println("=====��·���ͼ���======");
  	for(int i = 0; i < map.length; i++) {
  		for(int j = 0; j < map[i].length; j++) { 
  			System.out.print(map[i][j] + " ");//���һ��
  		}
  		System.out.println();
  		}

}
}
class A{
	
	//ʹ�õݹ���ݵ�˼�������������Թ�
	//1. findWay ��������ר�����ҳ��Թ���·��
	//2. ����ҵ����ͷ��� true ,���򷵻� false
	//3. map ���Ƕ�ά���飬����ʾ�Թ�
	//4. i,j ���������λ�ã���ʼ����λ��Ϊ(1,1)
	//5. ��Ϊ�����ǵݹ����·���������ȹ涨 map ����ĸ���ֵ�ĺ���
    //	 0 ��ʾ������ 1 ��ʾ�ϰ��� 2 ��ʾ������ 3 ��ʾ�߹��������߲�ͨ����·
	//6. �� map[6][5] =2 ��˵���ҵ�ͨ·,�Ϳ��Խ���������ͼ�����.
	//7. ��ȷ��������·���� ��->��->��->��
	
	public boolean findWay(int map[][],int i,int j){
		   if(map[6][5] == 2) {//˵���Ѿ��ҵ�
			   return true;
			} 
			if(map[i][j] == 0) {//��ǰ���λ�� 0,˵����ʾ������
			//���Ǽٶ�������ͨ
				map[i][j] = 2;
			//ʹ����·���ԣ���ȷ����λ���Ƿ���Ŀ�����ͨ
			//��->��->��->��
			if(findWay(map, i + 1, j)) {//������
				return true;
			} else if(findWay(map, i, j + 1)){//��
				return true;
			} else if(findWay(map, i-1, j)) {//��
				return true;
			} else if(findWay(map, i, j-1)){//��
				return true;
			} else {
				map[i][j] = 3;
				return false;
			}
			} else { //map[i][j] = 1 , 2, 3 
				return false;
			}
		
}
}
