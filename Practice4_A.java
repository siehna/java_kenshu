package unirita_contest;


import java.util.Scanner;

public class Practice4_A {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sd = new Scanner(System.in);
		String s = sd.next();

		int l = s.length();


		//if(l>3) {//文字列が偶数の場合　4文字以上
			if(l%2==0) {
				String front = s.substring(0, l/2);
				String end = s.substring(l/2);

				String head = front.substring(0,1);
				String nec = front.substring(1);
				String newFront = nec.concat(head);

				String tail = end.substring(end.length()-1);
				String leg = end.substring(0, end.length()-1);
				String newEnd = tail.concat(leg);

				String output = newFront.concat(newEnd);

				System.out.println(output);


			//奇数の場合
			}else {
				String front = s.substring(0,(l-1)/2);
				String end = s.substring((l+1)/2);
				String middle = s.substring((l-1)/2,(l-1)/2+1);

				String head = front.substring(0,1);
				String nec = front.substring(1);
				String newFront = nec.concat(head);

				String tail = end.substring(end.length()-1);
				String leg = end.substring(0, end.length()-1);
				String newEnd = tail.concat(leg);

				String output = newFront.concat(middle);
				output = output.concat(newEnd);

				System.out.println(output);
			}


		//}else {
			//System.out.println(s);
		//}



	}

}
