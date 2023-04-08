package 多重循环控制;
//介绍
//1)将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for ,while ,do…while 均可以作为外层循环和内层循环。
// [建议一般使用两层，最多不要超过 3 层, 否则，代码的可读性很差]
//2)实质上，嵌套循环就是把内层循环当成外层循环的循环体。
//  当只有内层循环的循环条件为 false 时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环[听不懂，走案例]。
//3)设外层循环次数为 m 次，内层为 n 次，则内层循环体实际上需要执行 m*n 次。

public class MultipleLoopControl {
    //请分析 下面的多重循环执行步骤,  并写出输出 => 韩老师的内存分析法
	//双层 for	
 public static void main(String[] args) {
	for(int i = 0; i < 2; i++) { //先思考
		for( int j = 0; j < 3; j++) {
			System.out.println("i=" + i + "j=" + j);
			}	
     }	
 }
}

