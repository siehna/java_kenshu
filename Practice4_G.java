package unirita_contest;

import java.util.Scanner;

public class Practice4_G {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sd = new Scanner(System.in);

		int dimension = sd.nextInt();
		String[] p = new String[dimension];
		String[] q = new String[dimension];

		for(int i=0; i<dimension; i++) {
			p[i] = sd.next();
		}
		for(int i=0; i<dimension; i++) {
			q[i] = sd.next();
		}

		double euq[] = new double[dimension];
		double ans = 0;

		for(int i=0; i<dimension; i++) {
			double pi= Double.parseDouble(p[i]);
			double qi= Double.parseDouble(q[i]);
			euq[i] = Math.pow(pi-qi, 2);
			ans = ans + euq[i];
		}
		double answer = Math.sqrt(ans);
		System.out.println(String.format("%.2f", answer));

	}

}
