package unirita_contest;

import java.io.BufferedReader;

public class Practice4_D {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader br = new BufferedReader(InputStreamReader(System.in));
		//トランザクションレコード件数
		int num = Integer.parseInt(br.readLine());


		String[] trans = (br.readLine()).split(" ");
		if(trans[0] =="I") {
			//挿入処理

		}else if(trans[0] =="U") {
			//更新処理

		}else if(trans[0] =="D") {
			//削除処理

		}


	}

}
