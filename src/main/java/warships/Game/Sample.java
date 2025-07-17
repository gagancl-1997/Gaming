package warships.Game;

import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value: ");
		
		String value = sc.next();
		str.append(value);
		
		System.out.println("First append: "+ str);
		
//		int n = 2;
		
//		while(n>0) {
//			System.out.println("Enter more append: ");
//			str.append(sc.nextLine());
//			n--;
//		}
		
		for(int i=0; i<2; i++) {
			System.out.println("Enter more values: ");
			String val = sc.next();
			str.append(val);
		}
		
		System.out.println("2nd append: "+ str);
	}
	
}
