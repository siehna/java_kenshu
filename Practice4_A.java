package unirita_contest;

import java.util.Scanner;

public class Practice4_A {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		String s = sd.nextLine();

		int l = s.length();
		String output;


		if(l>1) {//文字列が偶数の場合　2文字以上
			if(l%2==0) {
				String head = s.substring(0,1);
				String nec = s.substring(1, l/2);
				String tail = s.substring(s.length()-1);
				String leg = s.substring(l/2, s.length()-1);

				output = nec + head + tail + leg;
			//奇数の場合
			}else {
				String middle = s.substring((l-1)/2,(l-1)/2+1);
				String head = s.substring(0,1);
				String nec = s.substring(1,(l-1)/2);
				String tail = s.substring(s.length()-1);
				String leg = s.substring((l-1)/2+1, s.length()-1);

				output = nec + head + middle + tail + leg;
			}
			
		}else {
			output = s;
		}
		System.out.println(output);
	}

}
