package 成员方法;

//根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果

public class MethodExercise02 {
public static void main(String[]args){
	 BB b=new BB();
	 b.print(4,4,'*');
}	
}

class BB{
	public void print(int row,int column,char c){
		for(int i=1;i<=column;i++){
			for(int j=1;j<=row;j++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}