package unirita_contest;


import java.util.Scanner;
public class Practice1_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		String str2 = str.replaceAll("ta", "");

		System.out.println(str2);
	}
}
