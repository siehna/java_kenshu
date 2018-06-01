package kenshu3;

import java.io.IOException;


public class SortProgram_20180601 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ

		// ソートする前の状態を出力        
		int[] x = {26, 38, 12, 8, 44, 87, 13, 65, 3, 50, 83, 30};
		System.out.print("ソート前：");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

		// ソート
		x = SortProgram_20180601.sort(x);

		// ソート後の結果を出力
		System.out.println();
		System.out.print("ソート後：");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}

	public static int[] sort(int[] x) {
		for(int i=0;i<x.length-1;i++) {
			for(int j = 0; j<x.length-1; j++) {
				if(x[j]>x[j+1]) {
					int temp = x[j];
					x[j]=x[j+1];
					x[j+1] = temp;
				}else {
				}
			}
		}
		return x;
	}

}
