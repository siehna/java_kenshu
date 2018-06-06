package unirita_contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Practice4_B {		
		public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//何個あるかの数
			String str = br.readLine();
			int num = Integer.parseInt(str);

			//与えられる数値
			String inputString = br.readLine();
			String[] splitInput = inputString.split(" ");
			int[] init = new int[num];
			for(int i=0; i<num; i++) {
				init[i] = Integer.parseInt(splitInput[i]);
			}
				//+-の配列とまとめ用の配列
			int[] plus = new int[num];
			int[] minus = new int[num];
			int[][] sum = new int[num][3];

			//それぞれに値を入れる
			for(int i=0; i<num; i++) {
				plus[i] = init[i] + 1;
			}
			for(int i=0; i<num; i++) {
				minus[i] = init[i] - 1;
			}
			for(int i = 0; i<num; i++) {
				sum[i][0] = init[i];
			sum[i][1] = plus[i];
				sum[i][2] = minus[i];
			}
				//sumの中で比較してカウンタで数値をカウント
			int[][] counter = new int[num][3];
			for(int i=0; i<num; i++) {
				for(int j=0; j<num; j++) {
					if(sum[i][0]==sum[j][0] || sum[i][0] ==sum[j][1] || sum[i][0]==sum[j][2]) {
						counter[i][0]= counter[i][0] +1;
					}else if(sum[i][1]==sum[j][0] || sum[i][1] ==sum[j][1] || sum[i][1]==sum[j][2]) {
						counter[i][1]= counter[i][1] +1;
					}else if(sum[i][2]==sum[j][0] || sum[i][2] ==sum[j][1] || sum[i][2]==sum[j][2]) {
						counter[i][2]= counter[i][2] +1;
					}
				}
			}


	 		//counterの中の最大値が出現回数最大
	 		int max = 0;
	 		for(int i=0; i<num; i++) {
	 			for(int j=0; j<3; j++) {
	 				if(max < counter[i][j]) {
	 					max = counter[i][j];
	 				}
	 			}
	 		}


	 		System.out.println(max);




	}

}
