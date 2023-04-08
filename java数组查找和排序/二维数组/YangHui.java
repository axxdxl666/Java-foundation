package 二维数组;

//二维数组的应用案例
//1)使用二维数组打印一个 10 行杨辉三角

// 1
// 1  1
// 1  2  1
// 1  3  3  1
// 1  4  6  4  1
// 1  5  10 10 5  1
//.......
//【提示】
//1.第一行有1个元素，第n行有n个元素
//2.每一行的第一个元素和最后一个元素都是1
//3.从第三行开始，对于非第一个元素和最后一个元素的元素的值
//arr[i][j]=arr[i-1][j]+arr[i-1][j-1];

public class YangHui {
public static void main(String[] args){
	int[][] arr=new int [10][];
	for(int i=0;i<arr.length;i++){
		arr[i]=new int[i+1];
		for(int j=0;j<arr[i].length;j++){
			if(j==0||j==arr[i].length-1){
				arr[i][j]=1;
			}
			else{
				arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
			}
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}
}
