package ��ת�������break;

//ע�������ϸ��˵��:
//1.break�������ڶ��Ƕ�׵������еģ�
//����ͨ����ǩָ��Ҫ��ֹ������һ������
//2.��ǩ�Ļ���ʹ��
//label1:{.....
//label2:    {.....
//label3:        {.....
//               break;
//               .....
//              }
//          }
//      }

//�Ϻ����
//��1��break ������ָ���˳��Ĳ�
//��2��label1�Ǳ�ǩ�������ɳ���Աָ��
//��3��break��ָ�����ĸ�label���˳�������
//��4����ʵ�ʵĿ����У��Ϻ�������Ҫʹ�ñ�ǩ
//��5�����û��ָ��break��Ĭ���˳������ѭ����

public class BreakDetail {
public static void main(String[]args){
     label1:
     for(int j=0;j<4;j++){//���forѭ��
     label2:
    	  for(int i=0;i<10;i++){//�ڲ�forѭ��
    		  if(i==2){
    			  //break;//�ȼ� break label2
    			    break label1 ;
    		  }
    		System.out.println("i="+i);  
    	  }
     }
}
}
