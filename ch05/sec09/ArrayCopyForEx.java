package ch05.sec09;

public class ArrayCopyForEx {
	public static void main(String[] args) {
		int[] oldIntArr = {1,2,3};
		int[] newIntArr = new int[5];
		for(int i =0;i<oldIntArr.length;i++){
			newIntArr[i] = oldIntArr[i];
		}
		for(int i =0;i<newIntArr.length;i++){
			System.out.println();
		}
	}
}
