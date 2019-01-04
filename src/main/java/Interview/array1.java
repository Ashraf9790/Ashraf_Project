package Interview;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int nextInt = sc.nextInt();
	int size[]=new int[nextInt];
	for(int i=0;i<size.length;i++) {
		System.out.println("Enter the values");
		size[i] = sc.nextInt();
	}
	for(int b:size) {
		System.out.println(b);
	}
	
	}}


