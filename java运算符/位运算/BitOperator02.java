package 位运算;
   //位运算符 >>、<<和 >>>的运算规则:
   //1)算术右移 >>：低位溢出,符号位不变,并用符号位补溢出的高位
   //2)算术左移 <<:  符号位不变,低位补 0
   //3)>>> 逻辑右移也叫无符号右移,运算规则是: 低位溢出，高位补 0
   //4)特别说明：没有 <<< 符号
public class BitOperator02 {
	public static void main(String []args){
   
    // int a=1>>2; // 1 => 00000001 => 00000000 本质  1/2/2=0
	// int c=1<<2; // 1 => 00000001 => 00000100 本质    1*2*2=4	
		
		System.out.println(1>>2);// 1/2/2=0
		System.out.println(1<<2);// 1*2*2=4	
		System.out.println(4<<3);// 4*2*2*2=32
		System.out.println(15>>2)
		
		
		;//  15/2/2=3
		
		
	}
}
