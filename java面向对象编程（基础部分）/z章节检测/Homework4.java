package z章节检测 ;

//编写类C
//实现数组的复制功能copyArr
//输入旧数组，返回一个新数组，元素和旧数组一样

public class Homework4 {
public static void main(String[]args){
	int[] arr={1,2,3,4,5};
	C c=new C();
	int[] arrNew=c.copyArr(arr);
	for(int i=0;i<arrNew.length;i++){
		System.out.print(arrNew[i]+" ");
	}

}
}
class C{
	public int[] copyArr(int[]arr){
		int[] arrNew=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			arrNew[i]=arr[i];
		}
		return arrNew;
	}
}