package 数据类型;

public class FloatDetail {
    /* 浮点型在机器中的存放形式为  浮点数=符号位+指数位+尾数位（尾数部位可能丢失造成精度损失）
     * 单精度float4个字节，双精度double8个字节
     * java浮点型常量默认为double类型，声明float类型常量须后加f或F
     */
   public static void main(String[]args){
	   //float n1=1.1; 对不对？不对 要在1.1后加f或F，默认1.1为double型不能赋值给float型
	   float n2=1.1F;//正确
	   double n3=1.1;//正确
	   double n4=1.1F;//正确，因为float4个字节可以赋值给double8个字节
	   //十进制数形式：
	   double n5=.123;//等价0.123
   }
	
	
	
	
}
