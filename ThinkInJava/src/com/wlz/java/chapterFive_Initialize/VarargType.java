package com.wlz.java.chapterFive_Initialize;

public class VarargType {
	//�ɱ������ʹ�ã�arr��ʵ�ε���������
	public static void Test(Integer...arr){
		for(Integer i:arr){
			System.out.print(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr={1,3,5,9,6};
		VarargType.Test(arr);//1 3 5 9 6
		VarargType.Test(1,5,8,7,9);//1 5 8 7 9

	}

}
