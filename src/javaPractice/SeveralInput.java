package javaPractice;

import java.util.Scanner;

public class SeveralInput {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	while(sc.hasNext()) {
		System.out.println(sc.nextInt() + sc.nextInt());
	}
	//ctrl + z 를 하면 빠져나올수 있다. 
	
}
}
