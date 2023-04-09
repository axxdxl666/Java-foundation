package z章节检测;

//定义Music类
//里面有音乐名name、音乐时长times属性
//并有播放play功能和反回本身属性信息的功能方法getlnfo.

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
		System.out.println("音乐"+name+" "+"正在播放中");
	}
	public void getlnfo(){
		System.out.println("音乐名"+name+" "+"音乐时长"+times+"秒");
	}
}