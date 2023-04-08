package ÕÂ½Ú¼ì²â;
//Ğ´³öÃ°ÅİÅÅĞòµÄ´úÂë
public class Homework7 {
public static void main(String[]args){
	int[]  arr={20,56,13,24};
	int temp=0;
	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-i-1;j++){
			if(arr[j]>arr[j+1]){
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
		
	}
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
}
}
