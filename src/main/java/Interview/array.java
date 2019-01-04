package Interview;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int a[]=new int[4];
		for (int i = 0; i < a.length; i++) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the value of a");
			a[i] = scan.nextInt();
		}
	/*for (int j = 0; j < a.length; j++) {
		System.out.println(a[j]);
	}
	*/
		for(int b:a) {
			System.out.println(b);
		}
	}}