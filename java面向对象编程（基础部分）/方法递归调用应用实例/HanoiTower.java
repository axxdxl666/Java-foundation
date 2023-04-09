package 方法递归调用应用实例;

//汉诺塔传说
//汉诺塔：汉诺塔（又称河内塔）问题是源于印度一个古老传说的益智玩具。
//大梵天创造世界的时候做了三根金刚石柱子,在一根柱子上从下往上按照大小顺序摞着 64 片圆盘。
//大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
//并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。

//假如每秒钟移动一次，共需多长时间呢？
//移完这些金片需要 5845.54 亿年以上，太阳系的预期寿命据说也就是数百亿年。
//真的过了 5845.54 亿年，地球上的一切生命，连同梵塔、庙宇等，都早已经灰飞烟灭

//图片和问题见PPT
//汉诺塔代码实现
public class HanoiTower {
public static void main(String[]args){
	B b=new B();
	b.move(5,'A', 'B','C');
}
}
class B{
	public void move(int num,char a,char b,char c){
		if(num==1){
			System.out.println(a+"->"+c);
		}
		else{
			move(num-1,a,c,b);
			System.out.println(a+"->"+c);
			move(num-1,b,a,c);
			
		}
	}
}